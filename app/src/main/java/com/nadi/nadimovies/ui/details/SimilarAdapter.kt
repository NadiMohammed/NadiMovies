package com.nadi.nadimovies.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nadi.core.movie.Movie
import com.nadi.nadimovies.databinding.DesignSimilarBinding

class SimilarAdapter(private val onClickListener: OnClickListener) :
    ListAdapter<Movie.Result, SimilarAdapter.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))

        holder.itemView.setOnClickListener {
            onClickListener.onClick(getItem(position))
        }
    }

    class ViewHolder private constructor(private val binding: DesignSimilarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movie.Result) {
            binding.movie = item
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    DesignSimilarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }
    }

    class DiffCallback : DiffUtil.ItemCallback<Movie.Result>() {
        override fun areItemsTheSame(
            oldItem: Movie.Result,
            newItem: Movie.Result
        ): Boolean {
            return oldItem.id == newItem.id
        }

        override fun areContentsTheSame(
            oldItem: Movie.Result,
            newItem: Movie.Result
        ): Boolean {
            return oldItem == newItem
        }
    }

    class OnClickListener(val clickListener: (Movie: Movie.Result) -> Unit) {
        fun onClick(Movie: Movie.Result) = clickListener(Movie)
    }
}
