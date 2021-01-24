package com.nadi.nadimovies.ui.trailer;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.nadi.core.trailer.TrailerUseCase;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class TrailerViewModel_AssistedFactory implements ViewModelAssistedFactory<TrailerViewModel> {
  private final Provider<TrailerUseCase> trailerUseCase;

  @Inject
  TrailerViewModel_AssistedFactory(Provider<TrailerUseCase> trailerUseCase) {
    this.trailerUseCase = trailerUseCase;
  }

  @Override
  @NonNull
  public TrailerViewModel create(SavedStateHandle arg0) {
    return new TrailerViewModel(trailerUseCase.get());
  }
}
