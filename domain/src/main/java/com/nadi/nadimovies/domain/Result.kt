package com.nadi.nadimovies.domain


sealed class Result<out T : Any> {
    data class Success<out T : Any>(val results: T? = null) : Result<T>()
    data class Failed(val exception: Exception? = null) : Result<Nothing>()
}