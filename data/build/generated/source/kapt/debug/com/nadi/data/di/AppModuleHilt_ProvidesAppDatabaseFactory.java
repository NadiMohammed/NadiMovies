// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import android.content.Context;
import com.nadi.data.local.MainDatabase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModuleHilt_ProvidesAppDatabaseFactory implements Factory<MainDatabase> {
  private final Provider<Context> contextProvider;

  public AppModuleHilt_ProvidesAppDatabaseFactory(Provider<Context> contextProvider) {
    this.contextProvider = contextProvider;
  }

  @Override
  public MainDatabase get() {
    return providesAppDatabase(contextProvider.get());
  }

  public static AppModuleHilt_ProvidesAppDatabaseFactory create(Provider<Context> contextProvider) {
    return new AppModuleHilt_ProvidesAppDatabaseFactory(contextProvider);
  }

  public static MainDatabase providesAppDatabase(Context context) {
    return Preconditions.checkNotNullFromProvides(AppModuleHilt.INSTANCE.providesAppDatabase(context));
  }
}