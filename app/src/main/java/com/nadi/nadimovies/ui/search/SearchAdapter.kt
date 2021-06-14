package com.nadi.nadimovies.ui.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.nadi.nadimovies.databinding.DesignSearchMoviesBinding
import com.nadi.nadimovies.domain.search.SearchResults

class SearchAdapter(private val onSearchClickListener: OnSearchClickListener) :
    ListAdapter<SearchResults, SearchAdapter.ViewHolder>(DiffCallback) {

    companion object {
        private val DiffCallback = object : DiffUtil.ItemCallback<SearchResults>() {
            override fun areItemsTheSame(
                oldSearch: SearchResults,
                newSearch: SearchResults
            ): Boolean {
                return oldSearch == newSearch
            }

            override fun areContentsTheSame(
                oldSearch: SearchResults,
                newSearch: SearchResults
            ): Boolean {
                return oldSearch == newSearch
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder.from(parent)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), onSearchClickListener)
    }

    class ViewHolder private constructor(private val binding: DesignSearchMoviesBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(item: SearchResults, clickListener: OnSearchClickListener) {

            Glide.with(itemView)
                .load("https://image.tmdb.org/t/p/w500${item.poster_path}")
                .into(binding.movieImg)

            binding.movieNameTxt.text = item.title

            binding.movieDateTxt.text = item.release_date

            binding.rateTxt.text = item.vote_average.toString()


            itemView.setOnClickListener {
                clickListener.onSearchItemClick(item)
            }

        }

        companion object {
            fun from(parent: ViewGroup): ViewHolder {
                val binding =
                    DesignSearchMoviesBinding.inflate(
                        LayoutInflater.from(parent.context),
                        parent,
                        false
                    )
                return ViewHolder(binding)
            }
        }
    }

    interface OnSearchClickListener {
        fun onSearchItemClick(search: SearchResults)
    }


}
