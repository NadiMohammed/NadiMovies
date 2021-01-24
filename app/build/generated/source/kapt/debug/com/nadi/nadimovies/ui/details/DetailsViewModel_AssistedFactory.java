package com.nadi.nadimovies.ui.details;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.nadi.core.similar.SimilarUseCase;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class DetailsViewModel_AssistedFactory implements ViewModelAssistedFactory<DetailsViewModel> {
  private final Provider<SimilarUseCase> similarUseCase;

  @Inject
  DetailsViewModel_AssistedFactory(Provider<SimilarUseCase> similarUseCase) {
    this.similarUseCase = similarUseCase;
  }

  @Override
  @NonNull
  public DetailsViewModel create(SavedStateHandle arg0) {
    return new DetailsViewModel(similarUseCase.get(), arg0);
  }
}
