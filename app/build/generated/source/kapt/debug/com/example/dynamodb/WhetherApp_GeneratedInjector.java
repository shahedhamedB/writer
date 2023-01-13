package com.example.dynamodb;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = WhetherApp.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface WhetherApp_GeneratedInjector {
  void injectWhetherApp(WhetherApp whetherApp);
}
