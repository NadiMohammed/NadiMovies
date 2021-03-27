package com.nadi.nadimovies.domain.trailer


data class Trailer(
    val id: Int = 0,
    val results: List<Result> = listOf()
) {

    data class Result(
        val id: String = "",
        val iso_3166_1: String = "",
        val iso_639_1: String = "",
        val key: String = "",
        val name: String = "",
        val site: String = "",
        val size: Int = 0,
        val type: String = ""
    )
}