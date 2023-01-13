package com.example.dynamodb.ui.homewether;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0005\u001a\u00020\rR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\u000e"}, d2 = {"Lcom/example/dynamodb/ui/homewether/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSourse", "Lcom/example/dynamodb/retrofit/data/HomeDataSourse;", "(Lcom/example/dynamodb/retrofit/data/HomeDataSourse;)V", "getDynamodbWriterStatus", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/dynamodb/utils/Resource;", "Lcom/example/dynamodb/medule/DynamodbResponse;", "getGetDynamodbWriterStatus", "()Landroidx/lifecycle/MutableLiveData;", "getHomeDataSourse", "()Lcom/example/dynamodb/retrofit/data/HomeDataSourse;", "", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.dynamodb.retrofit.data.HomeDataSourse homeDataSourse = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.dynamodb.utils.Resource<com.example.dynamodb.medule.DynamodbResponse>> getDynamodbWriterStatus = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dynamodb.retrofit.data.HomeDataSourse homeDataSourse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dynamodb.retrofit.data.HomeDataSourse getHomeDataSourse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.dynamodb.utils.Resource<com.example.dynamodb.medule.DynamodbResponse>> getGetDynamodbWriterStatus() {
        return null;
    }
    
    public final void getDynamodbWriterStatus() {
    }
}