package com.nadi.data

import com.google.gson.Gson
import com.nadi.nadimovies.domain.Result
import retrofit2.Response

abstract class CallbackHandler {
    suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>): Result<T> {
        return try {
            val response = call.invoke()
            if (response.isSuccessful) {
                Result.Success(response.body()!!)
            } else {
                Result.Failed(
                    RuntimeException(
                        Gson().fromJson(
                            response.errorBody()?.string(),
                            Result.Failed::class.java
                        ).exception
                    )
                )
            }

        } catch (e: Exception) {
            Result.Failed(e)
        }
    }
}

//
//abstract class CallbackHandler {
//    suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>): OperationResult<T> {
//        return try {
//            val myResp = call.invoke()
//            if (myResp.isSuccessful) {
//                OperationResult.Success(myResp.body()!!)
//            } else {
//
//                /*
//              handle standard error codes
//              if (myResp.code() == 403){
//                  Log.i("responseCode","Authentication failed")
//              }
//               */
//
//                OperationResult.Error(
//                    myResp.errorBody()?.toString() ?: "Something goes wrong"
//                )
//            }
//
//        } catch (e: Exception) {
//            OperationResult.Error(e.message ?: "Internet error runs")
//        }
//    }
//}
//
//
