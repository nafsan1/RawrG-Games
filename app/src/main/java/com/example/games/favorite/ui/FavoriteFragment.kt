package com.example.movies.favorite.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.domain.model.Movies
import com.example.core.util.INTENT_DATA
import com.example.movies.base.BaseFragment
import com.example.movies.databinding.FragmentFavoriteBinding
import com.example.movies.detail_movies.ui.DetailMoviesActivity
import com.example.movies.favorite.adapter.FavoriteAdapter
import com.example.movies.favorite.viewmodel.FavoriteViewModel
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

    private fun setupAdapter(data: List<Movies>) = binding.apply {
        adapter = FavoriteAdapter(myData = data, listener = this@FavoriteFragment)
        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = adapter
    }

    override fun onItemClick(data: Movies) {
        val intent = Intent(requireActivity(), DetailMoviesActivity::class.java)
        intent.putExtra(INTENT_DATA, data)
        startActivity(intent)
    }

    override fun onDeleteClick(data: Movies) {
        viewModel.deletedMovies(data)
    }

}