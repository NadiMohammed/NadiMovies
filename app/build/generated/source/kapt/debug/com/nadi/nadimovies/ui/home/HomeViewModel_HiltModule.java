package com.nadi.nadimovies.ui.home;

import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.ViewModel;
import dagger.Binds;
import dagger.Module;
import dagger.hilt.InstallIn;
import dagger.hilt.android.components.ActivityRetainedComponent;
import dagger.hilt.codegen.OriginatingElement;
import dagger.multibindings.IntoMap;
import dagger.multibindings.StringKey;

@Module
@InstallIn(ActivityRetainedComponent.class)
@OriginatingElement(
    topLevelClass = HomeViewModel.class
)
public interface HomeViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.nadi.nadimovies.ui.home.HomeViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(HomeViewModel_AssistedFactory factory);
}
