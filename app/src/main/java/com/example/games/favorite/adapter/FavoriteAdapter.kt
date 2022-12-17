package com.example.games.favorite.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.core.domain.model.Games
import com.example.games.databinding.ItemLayoutBinding


class FavoriteAdapter(
    private val myData: List<Games>,
    private val listener: Listener
) :
    RecyclerView.Adapter<FavoriteAdapter.MoviesViewHolder>() {

    inner class MoviesViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("NotifyDataSetChanged", "SetTextI18n")
        fun bind(data: Games) {
            binding.apply {
                txtDate.setText("Release Date: "+data.released)
                txtTitle.setText(data.name)
                imageView.load(data.background_image) {
                    crossfade(true)
                }
                itemView.setOnClickListener {
                    listener.onItemClick(data)
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val binding =
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return MoviesViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int) {
        val data: Games = myData[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int = myData.size


    interface Listener {
        fun onItemClick(data: Games)
        fun onDeleteClick(data: Games)
    }
}
