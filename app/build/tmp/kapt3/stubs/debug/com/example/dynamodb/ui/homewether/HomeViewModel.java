package com.example.dynamodb.ui.homewether;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/dynamodb/ui/homewether/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "homeDataSourse", "Lcom/example/dynamodb/retrofit/data/HomeDataSourse;", "(Lcom/example/dynamodb/retrofit/data/HomeDataSourse;)V", "getHomeDataSourse", "()Lcom/example/dynamodb/retrofit/data/HomeDataSourse;", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.dynamodb.retrofit.data.HomeDataSourse homeDataSourse = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.example.dynamodb.retrofit.data.HomeDataSourse homeDataSourse) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.dynamodb.retrofit.data.HomeDataSourse getHomeDataSourse() {
        return null;
    }
}