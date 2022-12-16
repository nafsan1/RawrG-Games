package com.example.games.home.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.core.domain.model.Games
import com.example.games.databinding.ItemLayoutBinding


class HomeAdapter constructor(val listener: Listener) :
    PagingDataAdapter<Games, HomeAdapter.ViewHolder>(WATCHLIST_COMPARATOR) {

    interface Listener {
        fun onItemClick(data: Games)
    }

    inner class ViewHolder(private val binding: ItemLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
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

    companion object {
        private val WATCHLIST_COMPARATOR = object : DiffUtil.ItemCallback<Games>() {
            override fun areItemsTheSame(oldItem: Games, newItem: Games) =
                oldItem.id == newItem.id

            override fun areContentsTheSame(oldItem: Games, newItem: Games) =
                oldItem == newItem
        }
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding =
            ItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        return ViewHolder(binding)
    }
}