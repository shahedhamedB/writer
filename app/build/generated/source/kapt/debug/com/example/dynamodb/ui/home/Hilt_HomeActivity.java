package com.example.dynamodb.ui.home;

import android.content.Context;
import androidx.activity.contextaware.OnContextAvailableListener;
import com.example.dynamodb.core.base.BaseActivity;
import dagger.hilt.internal.GeneratedComponentManagerHolder;
import dagger.hilt.internal.UnsafeCasts;
import java.lang.Override;

/**
 * A generated base class to be extended by the @dagger.hilt.android.AndroidEntryPoint annotated class. If using the Gradle plugin, this is swapped as the base class via bytecode transformation.
 */
public abstract class Hilt_HomeActivity extends BaseActivity {
  private boolean injected = false;

  Hilt_HomeActivity() {
    super();
    _initHiltInternal();
  }

  private void _initHiltInternal() {
    addOnContextAvailableListener(new OnContextAvailableListener() {
      @Override
      public void onContextAvailable(Context context) {
        inject();
      }
    });
  }

  protected void inject() {
    if (!injected) {
      injected = true;
      ((HomeActivity_GeneratedInjector) UnsafeCasts.<GeneratedComponentManagerHolder>unsafeCast(this).generatedComponent()).injectHomeActivity(UnsafeCasts.<HomeActivity>unsafeCast(this));
    }
  }
}
