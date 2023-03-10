// Generated by Dagger (https://dagger.dev).
package com.example.dynamodb.ui.homewether;

import com.example.dynamodb.retrofit.data.HomeDataSourse;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<HomeDataSourse> homeDataSourseProvider;

  public HomeViewModel_Factory(Provider<HomeDataSourse> homeDataSourseProvider) {
    this.homeDataSourseProvider = homeDataSourseProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(homeDataSourseProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<HomeDataSourse> homeDataSourseProvider) {
    return new HomeViewModel_Factory(homeDataSourseProvider);
  }

  public static HomeViewModel newInstance(HomeDataSourse homeDataSourse) {
    return new HomeViewModel(homeDataSourse);
  }
}
