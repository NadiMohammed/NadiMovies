package com.nadi.nadimovies.ui.trailer;

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
    topLevelClass = TrailerViewModel.class
)
public interface TrailerViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.nadi.nadimovies.ui.trailer.TrailerViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(TrailerViewModel_AssistedFactory factory);
}
