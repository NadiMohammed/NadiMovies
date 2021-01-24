package com.nadi.nadimovies.ui.details;

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
    topLevelClass = DetailsViewModel.class
)
public interface DetailsViewModel_HiltModule {
  @Binds
  @IntoMap
  @StringKey("com.nadi.nadimovies.ui.details.DetailsViewModel")
  ViewModelAssistedFactory<? extends ViewModel> bind(DetailsViewModel_AssistedFactory factory);
}
