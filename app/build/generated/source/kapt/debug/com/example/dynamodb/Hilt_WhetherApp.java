package com.example.dynamodb;

import android.app.Application;
import androidx.annotation.CallSuper;
import dagger.hilt.android.internal.managers.ApplicationComponentManager;
import dagger.hilt.android.internal.managers.ComponentSupplier;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Object;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.HiltAndroidApp annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_WhetherApp extends Application implements GeneratedComponentManagerHolder {
  private boolean injected = false;

  private final ApplicationComponentManager componentManager = new ApplicationComponentManager(new ComponentSupplier() {
    @Override
    public Object get() {
      return DaggerWhetherApp_HiltComponents_SingletonC.builder()
          .applicationContextModule(new ApplicationContextModule(Hilt_WhetherApp.this)).build();
    }
  });

  @Override
  public final ApplicationComponentManager componentManager() {
    return componentManager;
  }

  @Override
  public final Object generatedComponent() {
    return this.componentManager().generatedComponent();
  }

  @CallSuper
  @Override
  public void onCreate() {
    hiltInternalInject();
    super.onCreate();
  }

  protected void hiltInternalInject() {
    if (!injected) {
      injected = true;
      // This is a known unsafe cast, but is safe in the only correct use case:
      // WhetherApp extends Hilt_WhetherApp
      ((WhetherApp_GeneratedInjector) generatedComponent()).injectWhetherApp(UnsafeCasts.<WhetherApp>unsafeCast(this));
    }
  }
}
