package com.example.movies.favorite.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.core.domain.model.Movies
import com.example.core.util.APIPICTUREMOVIE_SMALL
import com.example.movies.databinding.ItemLayoutMoviesBinding


class FavoriteAdapter(
    private val myData: List<Movies>,
    private val listener: Listener
) :
    RecyclerView.Adapter<FavoriteAdapter.MoviesViewHolder>() {

    inner class MoviesViewHolder(private val binding: ItemLayoutMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NotifyDataSetChanged")
        fun bind(data: Movies) {
            binding.apply {
                imgFav.bringToFront()
                imgFav.visibility = View.VISIBLE
                txtDate.setText(data.release_date)
                txtTitle.setText(data.title)
                txtOverview.setText(data.overview)
                imageView.load("$APIPICTUREMOVIE_SMALL${data.poster_path}") {
                    crossfade(true)
                }
                itemView.setOnClickListener {
                    listener.onItemClick(data)
                }
                imgFav.setOnClickListener {
                    listener.onDeleteClick(data)
                }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding =
            ItemLayoutMoviesBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val data: Movies = myData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = myData.size


    interface Listener {
        fun onItemClick(data: Movies)
        fun onDeleteClick(data: Movies)
    }
}