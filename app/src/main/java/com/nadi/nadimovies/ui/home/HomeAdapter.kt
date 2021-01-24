package com.nadi.nadimovies.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.nadi.core.movie.Movie
import com.nadi.nadimovies.databinding.DesignHomeViewpagerBinding
import com.nadi.nadimovies.databinding.DesignMoviesBinding


//class HomeAdapter(private val viewType: MoviesViewType, private val onClickListener: OnClickListener) : ListAdapter<Movie.Result, HomeAdapter.ViewHolder>(DiffCallback()) {
class HomeAdapter(
    private val viewType: MoviesViewType,
    private val onClickListener: OnMovieClickListener
) : ListAdapter<Movie.Result, RecyclerView.ViewHolder>(DiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
//        return ViewHolder.from(parent)
        return when (this.viewType) {
            MoviesViewType.PAGER -> MoviePagerViewHolder.from(parent)
            MoviesViewType.NORMAL -> ViewHolder.from(parent)
        }
    }

//    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
//        holder.bind(getItem(position))

//        holder.itemView.setOnClickListener {
//            onClickListener.onClick(getItem(position))
        when (holder) {
//                is MovieGridViewHolder -> holder.bind(getItem(position), onClickListener)
            is MoviePagerViewHolder -> holder.bind(getItem(position), onClickListener)
//                is MovieViewHolder -> holder.bind(getItem(position), onClickListener)
            is ViewHolder -> holder.bind(getItem(position), onClickListener)
        }

//        }
    }

    class MoviePagerViewHolder(private val binding: DesignHomeViewpagerBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: Movie.Result, clickListener: OnMovieClickListener) {
            binding.movie = item
            binding.clickListener = clickListener
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
            binding.movie = item
            binding.clickListener = clickListener
            binding.executePendingBindings()
        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    DesignMoviesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
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

    interface OnMovieClickListener {
        fun onMovieItemClick(movie: Movie.Result)
    }

    enum class MoviesViewType { PAGER, NORMAL }

//    class OnClickListener(val clickListener: (Movie: Movie.Result) -> Unit) {
//        fun onClick(Movie: Movie.Result) = clickListener(Movie)
//    }
}

