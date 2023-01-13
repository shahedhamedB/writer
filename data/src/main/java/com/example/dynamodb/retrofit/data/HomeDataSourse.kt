package com.example.dynamodb.retrofit.data

import com.example.dynamodb.retrofit.services.NetworkService
import javax.inject.Inject

class HomeDataSourse @Inject constructor(
    private val networkService: NetworkService
) : BaseDataSource() {

}