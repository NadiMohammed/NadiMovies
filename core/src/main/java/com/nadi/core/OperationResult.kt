package com.nadi.core


sealed class OperationResult<out T : Any> {
    data class Success<out T : Any>(val data: T) : OperationResult<T>()
    data class Error(val exception: String) : OperationResult<Nothing>()
}
