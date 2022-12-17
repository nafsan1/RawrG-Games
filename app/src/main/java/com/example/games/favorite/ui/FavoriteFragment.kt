package com.example.games.favorite.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.domain.model.Games
import com.example.core.util.INTENT_DATA
import com.example.games.base.BaseFragment
import com.example.games.databinding.FragmentFavoriteBinding
import com.example.games.detail.ui.DetailActivity
import com.example.games.favorite.adapter.FavoriteAdapter
import com.example.games.favorite.viewmodel.FavoriteViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FavoriteFragment :
    BaseFragment<FragmentFavoriteBinding>({ FragmentFavoriteBinding.inflate(it) }),
    FavoriteAdapter.Listener {

    private lateinit var adapter: FavoriteAdapter
    private val viewModel: FavoriteViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getDataFavorite()
    }

    private fun getDataFavorite() {
        viewModel.getFavorite().observe(requireActivity()) {
            if (it.size > 0){
                binding.recyclerView.visibility = View.VISIBLE
                binding.txtEmpty.visibility = View.GONE
            }else{
                binding.recyclerView.visibility = View.GONE
                binding.txtEmpty.visibility = View.VISIBLE
            }
            setupAdapter(it)
        }
    }

    private fun setupAdapter(data: List<Games>) = binding.apply {
        adapter = FavoriteAdapter(myData = data, listener = this@FavoriteFragment)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(data: Games) {
        val intent = Intent(requireActivity(), DetailActivity::class.java)
        intent.putExtra(INTENT_DATA, data)
        startActivity(intent)
    }

    override fun onDeleteClick(data: Games) {
        viewModel.deletedMovies(data)
    }

}
