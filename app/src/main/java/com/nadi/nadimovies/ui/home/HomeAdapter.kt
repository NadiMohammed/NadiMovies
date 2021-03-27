package com.nadi.nadimovies.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadi.nadimovies.databinding.DesignHomeViewpagerBinding
import com.nadi.nadimovies.databinding.DesignMoviesBinding
import com.nadi.nadimovies.domain.movie.Movie

class HomeAdapter(
    private val viewType: MoviesViewType,
    private val onClickListener: OnMovieClickListener
) : ListAdapter<Movie.Result, RecyclerView.ViewHolder>(DiffCallback) {

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<Movie.Result>() {
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
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (this.viewType) {
            MoviesViewType.PAGER -> MoviePagerViewHolder.from(parent)
            MoviesViewType.NORMAL -> ViewHolder.from(parent)
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

        when (holder) {
            is MoviePagerViewHolder -> holder.bind(getItem(position)!!, onClickListener)
            is ViewHolder -> holder.bind(getItem(position)!!, onClickListener)
        }
    }

    class MoviePagerViewHolder(private val binding: DesignHomeViewpagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie.Result, clickListener: OnMovieClickListener) {
            binding.movieNameTxt.text = item.title

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w500${item.poster_path}")
                .into(binding.movieImg)

            itemView.setOnClickListener {
                clickListener.onMovieItemClick(item)
            }
        }


        companion object {
            fun from(parent: ViewGroup): MoviePagerViewHolder {
                val binding = DesignHomeViewpagerBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                return MoviePagerViewHolder(binding)
            }
        }

    }

    class ViewHolder private constructor(private val binding: DesignMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: Movie.Result, clickListener: OnMovieClickListener) {
            binding.movieNameTxt.text = item.title

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w500${item.poster_path}")
                .into(binding.movieImg)

            binding.rateTxt.text = item.vote_average.toString()

            itemView.setOnClickListener {
                clickListener.onMovieItemClick(item)
            }
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    DesignMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
                return ViewHolder(binding)
            }
        }
    }


    interface OnMovieClickListener {
        fun onMovieItemClick(movie: Movie.Result)
    }

    enum class MoviesViewType {
        PAGER,
        NORMAL
    }

}

