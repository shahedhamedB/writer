package com.example.dynamodb.ui.homewether

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dynamodb.medule.DynamodbResponse
import com.example.dynamodb.retrofit.data.HomeDataSourse
import com.example.dynamodb.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class HomeViewModel @Inject constructor(val homeDataSourse: HomeDataSourse) : ViewModel() {
    val getDynamodbWriterStatus = MutableLiveData<Resource<DynamodbResponse>>()

    fun getDynamodbWriterStatus() {
        viewModelScope.launch {
            val response = homeDataSourse.getDynamodbWriter()
            getDynamodbWriterStatus.postValue(response)
        }
    }
}