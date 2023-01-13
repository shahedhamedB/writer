// Generated by Dagger (https://dagger.dev).
package com.example.dynamodb.core.base;

import com.example.dynamodb.utils.Prefs;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
import dagger.internal.QualifierMetadata;
import javax.inject.Provider;

@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class BaseActivity_MembersInjector implements MembersInjector<BaseActivity> {
  private final Provider<Prefs> prefsProvider;

  public BaseActivity_MembersInjector(Provider<Prefs> prefsProvider) {
    this.prefsProvider = prefsProvider;
  }

  public static MembersInjector<BaseActivity> create(Provider<Prefs> prefsProvider) {
    return new BaseActivity_MembersInjector(prefsProvider);
  }

  @Override
  public void injectMembers(BaseActivity instance) {
    injectPrefs(instance, prefsProvider.get());
  }

  @InjectedFieldSignature("com.example.dynamodb.core.base.BaseActivity.prefs")
  public static void injectPrefs(BaseActivity instance, Prefs prefs) {
    instance.prefs = prefs;
  }
}