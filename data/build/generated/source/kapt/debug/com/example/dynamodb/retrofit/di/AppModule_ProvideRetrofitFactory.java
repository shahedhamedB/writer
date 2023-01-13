// Generated by Dagger (https://dagger.dev).
package com.example.dynamodb.retrofit.di;

import com.example.dynamodb.utils.Prefs;
import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final Provider<Gson> gsonProvider;

  private final Provider<Prefs> prefsProvider;

  public AppModule_ProvideRetrofitFactory(Provider<Gson> gsonProvider,
      Provider<Prefs> prefsProvider) {
    this.gsonProvider = gsonProvider;
    this.prefsProvider = prefsProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(gsonProvider.get(), prefsProvider.get());
  }

  public static AppModule_ProvideRetrofitFactory create(Provider<Gson> gsonProvider,
      Provider<Prefs> prefsProvider) {
    return new AppModule_ProvideRetrofitFactory(gsonProvider, prefsProvider);
  }

  public static Retrofit provideRetrofit(Gson gson, Prefs prefs) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideRetrofit(gson, prefs));
  }
}