package com.nadi.nadimovies.domain.movie

import java.io.Serializable


data class Movie(
    val dates: Dates? = Dates(),
    val page: Int? = 0,
    val results: List<Result> = listOf(),
    val total_pages: Int? = 0,
    val total_results: Int? = 0
) : Serializable {
    data class Dates(
        val maximum: String? = "",
        val minimum: String? = ""
    ) : Serializable

    data class Result(
        val adult: Boolean? = false,
        val backdrop_path: String? = "",
        val genre_ids: List<Int?>? = listOf(),
        val id: Int? = 0,
        val original_language: String? = "",
        val original_title: String? = "",
        val overview: String? = "",
        val popularity: Double? = 0.0,
        val poster_path: String? = "",
        val release_date: String? = "",
        val title: String? = "",
        val video: Boolean? = false,
        val vote_average: Double? = 0.0,
        val vote_count: Int? = 0
    ) : Serializable
}