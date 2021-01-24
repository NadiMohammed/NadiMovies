package com.nadi.nadimovies.util

import android.annotation.SuppressLint
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.bumptech.glide.Glide
import com.nadi.core.movie.Movie
import com.nadi.nadimovies.R
import com.nadi.nadimovies.ui.details.SimilarAdapter
import com.nadi.nadimovies.ui.home.HomeAdapter
import kotlin.math.abs

//object BindingAdapter {
@BindingAdapter("imageUrl")
fun ImageView.bindImage(imgUrl: String?) {
    imgUrl?.let {
        Glide.with(context)
            .load("https://image.tmdb.org/t/p/w500$it")
            .into(this)
    }
}


@BindingAdapter("apiStatus")
fun ImageView.bindStatus(status: ApiStatus) {
    when (status) {
        ApiStatus.ERROR -> {
            visibility = View.VISIBLE
            setImageResource(R.drawable.error_icon)
        }
        ApiStatus.LOADING -> {
            visibility = View.VISIBLE
            setImageResource(R.drawable.loading_icon)
        }
        ApiStatus.DONE -> {
            visibility = View.GONE
        }
    }
}

@BindingAdapter("listData")
fun RecyclerView.bindPhotosImage(data: List<Movie.Result>?) {
    (adapter as HomeAdapter).submitList(data)
}

@BindingAdapter("similarListData")
fun RecyclerView.bindSimilarPhotosImage(data: List<Movie.Result>?) {
    (adapter as SimilarAdapter).submitList(data)
}

@BindingAdapter("textName")
fun TextView.setNameFormatted(item: String?) {
    text = item
}

@SuppressLint("SetTextI18n")
@BindingAdapter("textRate")
fun TextView.setRate(item: String?) {
    text = "$item/10"
}

@BindingAdapter("voteAverage")
fun TextView.setVoteAverage(item: Double?) {
    text = item.toString()
}

@BindingAdapter("bindViewPager")
fun ViewPager2.bindViewPager(movies: List<Movie.Result>?) {
    offscreenPageLimit = 3

    getChildAt(0).overScrollMode = RecyclerView.OVER_SCROLL_NEVER

    val compositePageTransformer = CompositePageTransformer()

    compositePageTransformer.addTransformer { page, position ->
        page.scaleY = 0.85f + (1 - abs(position)) * 0.15f
    }

    setPageTransformer(compositePageTransformer)

    (adapter as HomeAdapter).submitList(movies)
}