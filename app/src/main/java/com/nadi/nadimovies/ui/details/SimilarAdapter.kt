package com.nadi.nadimovies.ui.details

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadi.nadimovies.databinding.DesignSimilarBinding
import com.nadi.nadimovies.domain.movie.Movie

class SimilarAdapter(
    private val onClickListener: OnSimilarClickListener
) : ListAdapter<Movie.Result, SimilarAdapter.ViewHolder>(DiffCallback()) {

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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), onClickListener)
    }

    class ViewHolder private constructor(private val binding: DesignSimilarBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movie.Result, clickListener: OnSimilarClickListener) {

            binding.movieNameTxt.text = item.title

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w500${item.poster_path}")
                .into(binding.movieImg)
            binding.rateTxt.text = item.vote_average.toString()

            itemView.setOnClickListener {
                clickListener.onSimilarItemClick(item)
            }

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    DesignSimilarBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }
    }

    interface OnSimilarClickListener {
        fun onSimilarItemClick(movie: Movie.Result)
    }
}
