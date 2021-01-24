package com.nadi.data

import com.nadi.core.OperationResult
import retrofit2.Response

abstract class CallbackHandler {
    suspend fun <T : Any> safeApiCall(call: suspend () -> Response<T>): OperationResult<T> {
        return try {
            val myResp = call.invoke()
            if (myResp.isSuccessful) {
                com.nadi.core.OperationResult.Success(myResp.body()!!)
            } else {

                /*
              handle standard error codes
              if (myResp.code() == 403){
                  Log.i("responseCode","Authentication failed")
              }
               */

                OperationResult.Error(
                    myResp.errorBody()?.toString() ?: "Something goes wrong"
                )
            }

        } catch (e: Exception) {
            OperationResult.Error(e.message ?: "Internet error runs")
        }
    }
}