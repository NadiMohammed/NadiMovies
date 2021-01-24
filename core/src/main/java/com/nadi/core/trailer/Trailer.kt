package com.nadi.core.trailer

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Trailer(
    val id: Int = 0,
    val results: List<Result> = listOf()
) : Parcelable {
    @Parcelize
    data class Result(
        val id: String = "",
        val iso_3166_1: String = "",
        val iso_639_1: String = "",
        val key: String = "",
        val name: String = "",
        val site: String = "",
        val size: Int = 0,
        val type: String = ""
    ) : Parcelable
}