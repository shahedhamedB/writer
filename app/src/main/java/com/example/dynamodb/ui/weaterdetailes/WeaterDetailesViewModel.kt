package com.example.dynamodb.ui.weaterdetailes

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dynamodb.medule.DynamodbModual
import com.example.dynamodb.medule.DynamodbResponse
import com.example.dynamodb.retrofit.data.HomeDataSourse
import com.example.dynamodb.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class WeaterDetailesViewModel @Inject constructor(val homeDataSourse: HomeDataSourse) : ViewModel() {
    var dynamodbModual: DynamodbModual?=null
}