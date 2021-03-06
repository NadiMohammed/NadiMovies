// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import okhttp3.logging.HttpLoggingInterceptor;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModuleHilt_ProvidesLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  @Override
  public HttpLoggingInterceptor get() {
    return providesLoggingInterceptor();
  }

  public static AppModuleHilt_ProvidesLoggingInterceptorFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static HttpLoggingInterceptor providesLoggingInterceptor() {
    return Preconditions.checkNotNullFromProvides(AppModuleHilt.INSTANCE.providesLoggingInterceptor());
  }

  private static final class InstanceHolder {
    private static final AppModuleHilt_ProvidesLoggingInterceptorFactory INSTANCE = new AppModuleHilt_ProvidesLoggingInterceptorFactory();
  }
}
