package com.example.movies.home.ui

import android.os.Bundle
import android.view.View
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.paging.LoadState
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.core.domain.model.Movies
import com.example.movies.base.BaseFragment
import com.example.movies.databinding.FragmentHomeBinding
import com.example.movies.home.viewmodel.HomeViewModel
import com.example.movies.home.adapter.HomeAdapter
import com.example.movies.home.adapter.LoadStateAdapter
import com.example.movies.utilities.SnackBar.snackBarError
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment:BaseFragment<FragmentHomeBinding>({FragmentHomeBinding.inflate(it)}),HomeAdapter.Listener {

    private lateinit var adapter:HomeAdapter

    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupAdapter()
        getDataMovies()
    }

    private fun getDataMovies(){
        viewModel.getAllMovie().observe(requireActivity()){
            adapter.submitData(lifecycle,it)
        }
    }

    private fun setupAdapter() {
        adapter = HomeAdapter(this)
        binding.recyclerView.adapter = adapter.withLoadStateHeaderAndFooter(
            header = LoadStateAdapter { adapter.retry() },
            footer = LoadStateAdapter { adapter.retry() }
        )
        binding.recyclerView.layoutManager = LinearLayoutManager(requireActivity())
        binding.recyclerView.itemAnimator?.changeDuration = 0

        adapter.addLoadStateListener { loadState ->
            val loading = loadState.source.refresh is LoadState.Loading

            if (loadState.source.refresh is LoadState.Error) {
                activity?.snackBarError("No Connection, please check your internet connection and try again")
            }
            showLoadingAdapter(loading)
            binding.recyclerView.isVisible = !(loadState.source.refresh is LoadState.NotLoading &&
                    loadState.append.endOfPaginationReached &&
                    adapter.itemCount < 1)
        }
    }

    private fun showLoadingAdapter(isLoading: Boolean) {
        if (isLoading) {
            binding.recyclerView.visibility = View.GONE
            binding.progressBar.visibility = View.VISIBLE

        } else {
            binding.recyclerView.visibility = View.VISIBLE
            binding.progressBar.visibility = View.GONE
        }
    }

    override fun onItemClick(data: Movies) {

    }
}