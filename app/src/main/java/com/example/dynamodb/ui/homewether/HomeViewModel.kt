package com.example.dynamodb.ui.homewether

import androidx.lifecycle.ViewModel
import com.example.dynamodb.retrofit.data.HomeDataSourse
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
@HiltViewModel
class HomeViewModel @Inject constructor(val homeDataSourse: HomeDataSourse) : ViewModel() {

}