package com.example.dynamodb.retrofit.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\t"}, d2 = {"Lcom/example/dynamodb/retrofit/data/HomeDataSourse;", "Lcom/example/dynamodb/retrofit/data/BaseDataSource;", "networkService", "Lcom/example/dynamodb/retrofit/services/NetworkService;", "(Lcom/example/dynamodb/retrofit/services/NetworkService;)V", "getDynamodbWriter", "Lcom/example/dynamodb/utils/Resource;", "Lcom/example/dynamodb/medule/DynamodbResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data_debug"})
public final class HomeDataSourse extends com.example.dynamodb.retrofit.data.BaseDataSource {
    private final com.example.dynamodb.retrofit.services.NetworkService networkService = null;
    
    @javax.inject.Inject()
    public HomeDataSourse(@org.jetbrains.annotations.NotNull()
    com.example.dynamodb.retrofit.services.NetworkService networkService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDynamodbWriter(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.dynamodb.utils.Resource<com.example.dynamodb.medule.DynamodbResponse>> continuation) {
        return null;
    }
}