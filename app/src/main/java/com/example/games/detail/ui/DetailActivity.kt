package com.example.games.detail.ui

import android.annotation.SuppressLint
import android.graphics.PorterDuff
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.activity.viewModels
import androidx.core.content.ContextCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import coil.load
import com.example.core.domain.enum.FavoriteEnum
import com.example.core.domain.model.Games
import com.example.core.util.INTENT_DATA
import com.example.core.util.fromHtml
import com.example.games.detail.viewmodel.DetailViewModel
import com.example.games.R
import com.example.games.databinding.ActivityDetailGamesBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailGamesBinding

    private val viewModel: DetailViewModel by viewModels()

    private var games: Games? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailGamesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getIntentData()
        setFavButton()
        onCLick()
        getDetail()
    }

    private fun setFavButton() = binding.apply {
        viewModel.getFavorite().observe(this@DetailActivity) {
            it.forEach { data ->
                if (data.id == games?.id) {
                    imgFav.setBackgroundResource(R.drawable.ic_fav_purple)
                    imgFav.tag = FavoriteEnum.Favorite
                }
            }
        }
    }

    private fun onCLick() = binding.apply {
        imgFav.setOnClickListener {
            if (it.tag == FavoriteEnum.Favorite) {
                games?.let { data -> viewModel.deletedMovies(data) }
                it.setBackgroundResource(R.drawable.ic_fav_border_purple)
                it.tag = FavoriteEnum.UnFavorite
            } else {
                games?.let { data -> viewModel.insertMovies(data) }
                it.setBackgroundResource(R.drawable.ic_fav_purple)
                it.tag = FavoriteEnum.Favorite
            }
        }
    }

    private fun getIntentData() {
        games = if (Build.VERSION.SDK_INT >= 33) {
            intent.getParcelableExtra(INTENT_DATA)
        } else {
            intent.getParcelableExtra(INTENT_DATA)
        }
    }

    @SuppressLint("SetTextI18n")
    private fun setData(games: Games?) = binding.apply {
        games?.let { initToolbar(it.name) }
        txtDate.text = "Release date : ${games?.released}"
        imageView.load(games?.background_image) {
            crossfade(true)
        }
        txtOverview.setText(fromHtml(games?.description))
    }

    @Suppress("DEPRECATION")
    private fun initToolbar(message: String) = binding.apply {
        toolbar.setNavigationIcon(R.drawable.ic_baseline_arrow_back_24)
        if (toolbar.navigationIcon != null) {
            toolbar.navigationIcon?.setColorFilter(
                ContextCompat.getColor(
                    this@DetailActivity,
                    R.color.md_white_1000
                ), PorterDuff.Mode.SRC_ATOP
            )
        }
        toolbar.title = message
        toolbar.setTitleTextColor(
            ContextCompat.getColor(
                this@DetailActivity,
                R.color.md_white_1000
            )
        )
        setSupportActionBar(toolbar)

        if (supportActionBar != null)
            supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun getDetail() {
        lifecycleScope.launch {
            games?.id?.let { viewModel.getDetail(it) }
            repeatOnLifecycle(Lifecycle.State.STARTED) {
                viewModel.uiState.collect {
                    setData(it)
                }
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}
