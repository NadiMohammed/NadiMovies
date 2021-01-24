package com.nadi.nadimovies.ui.home;

import androidx.annotation.NonNull;
import androidx.hilt.lifecycle.ViewModelAssistedFactory;
import androidx.lifecycle.SavedStateHandle;
import com.nadi.core.movie.MovieUseCase;
import java.lang.Override;
import javax.inject.Inject;
import javax.inject.Provider;

public final class HomeViewModel_AssistedFactory implements ViewModelAssistedFactory<HomeViewModel> {
  private final Provider<MovieUseCase> movieUseCase;

  @Inject
  HomeViewModel_AssistedFactory(Provider<MovieUseCase> movieUseCase) {
    this.movieUseCase = movieUseCase;
  }

  @Override
  @NonNull
  public HomeViewModel create(SavedStateHandle arg0) {
    return new HomeViewModel(movieUseCase.get());
  }
}
