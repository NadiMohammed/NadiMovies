package com.nadi.nadimovies.domain.search

data class Search(
    val page: Int = 0,
    val results: List<SearchResults> = listOf(),
    val total_pages: Int = 0,
    val total_results: Int = 0
)
