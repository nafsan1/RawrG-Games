package com.example.movies.home.adapter


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.core.domain.model.Movies
import com.example.core.util.APIPICTUREMOVIE_SMALL
import com.example.movies.databinding.ItemLayoutMoviesBinding


class HomeAdapter constructor(val listener: Listener) :
    PagingDataAdapter<Movies, HomeAdapter.CounselorViewHolder>(WATCHLIST_COMPARATOR) {

    interface Listener {
        fun onItemClick(data: Movies)
    }

    inner class CounselorViewHolder(private val binding: ItemLayoutMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Movies, position: Int) {
            binding.apply {
                txtDate.setText(data.release_date)
                txtTitle.setText(data.title)
                txtOverview.setText(data.overview)
                imageView.load("$APIPICTUREMOVIE_SMALL${data.poster_path}") {
                    crossfade(true)
                }
                itemView.setOnClickListener {
                    listener.onItemClick(data)
                }
            }
        }
    }

    companion object {
        private val WATCHLIST_COMPARATOR = object : DiffUtil.ItemCallback<Movies>() {
            override fun areItemsTheSame(oldItem: Movies, newItem: Movies) =
                oldItem.moviesId == newItem.moviesId

            override fun areContentsTheSame(oldItem: Movies, newItem: Movies) =
                oldItem == newItem
        }
    }

    override fun onBindViewHolder(holder: CounselorViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem, position)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CounselorViewHolder {
        val binding =
            ItemLayoutMoviesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return CounselorViewHolder(binding)
    }
}