package com.example.games.search.ui

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.TextView.OnEditorActionListener
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.domain.model.Games
import com.example.core.util.INTENT_DATA
import com.example.core.util.hideKeyboard
import com.example.games.databinding.ActivitySearchBinding
import com.example.games.detail.ui.DetailActivity
import com.example.games.search.adapter.SearchAdapter
import com.example.games.search.viewmodel.SearchViewModel
import com.example.games.utilities.LoadStateAdapter
import com.example.games.utilities.SnackBar.snackBarError
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class SearchActivity : AppCompatActivity(), SearchAdapter.Listener {

    private lateinit var binding: ActivitySearchBinding

    private val viewModel: SearchViewModel by viewModels()

    private lateinit var adapter: SearchAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(binding.root)
        toolbar()
        onClick()
        setupAdapter()
    }

    private fun getSearch() {
        val query = binding.etSearch.text.toString()
        viewModel.getSearch(query).observe(this) {

            adapter.submitData(lifecycle, it)
        }
    }

    private fun onClick() = binding.apply {
        etSearch.setOnEditorActionListener(OnEditorActionListener { _, actionId, _ ->
            if (actionId == EditorInfo.IME_ACTION_SEARCH) {
                binding.recyclerView.visibility = View.GONE
                hideKeyboard()
                getSearch()
                return@OnEditorActionListener true
            }
            false
        })
    }

    private fun toolbar() {
        supportActionBar?.title = "Search"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

    }

    private fun setupAdapter() {
        adapter = SearchAdapter(this)
        binding.recyclerView.adapter = adapter.withLoadStateHeaderAndFooter(
            header = LoadStateAdapter { adapter.retry() },
            footer = LoadStateAdapter { adapter.retry() }
        )

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.itemAnimator?.changeDuration = 0

        adapter.addLoadStateListener { loadState ->
            val loading = loadState.source.refresh is LoadState.Loading

            if (loadState.source.refresh is LoadState.Error) {
                snackBarError("No Connection, please check your internet connection and try again")
            }
            showLoadingAdapter(loading)
            binding.recyclerView.isVisible = !(loadState.source.refresh is LoadState.NotLoading &&
                    loadState.append.endOfPaginationReached &&
                    adapter.itemCount < 1)

            if (adapter.itemCount < 1){
                if (binding.progressBar.visibility == View.VISIBLE){
                    binding.txtNotFound.visibility = View.GONE
                }else{
                    binding.txtNotFound.visibility = View.VISIBLE
                }
            }
        }
    }

    private fun showLoadingAdapter(isLoading: Boolean) {
        if (isLoading) {
            binding.recyclerView.visibility = View.GONE
            binding.txtNotFound.visibility = View.GONE
            binding.progressBar.visibility = View.VISIBLE
        } else {
            binding.recyclerView.visibility = View.VISIBLE
            binding.progressBar.visibility = View.GONE
            binding.txtNotFound.visibility = View.GONE
        }
    }

    override fun onItemClick(data: Games) {
        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra(INTENT_DATA, data)
        startActivity(intent)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            finish()
        }
        return super.onOptionsItemSelected(item)
    }
}