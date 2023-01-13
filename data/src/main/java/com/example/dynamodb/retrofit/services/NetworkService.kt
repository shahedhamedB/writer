package com.example.dynamodb.retrofit.services

import com.example.dynamodb.medule.DynamodbResponse
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*



interface NetworkService {


    @GET("default/dynamodb-writer")
    suspend  fun getDynamodbWriter(

    ) : Response<DynamodbResponse>
}