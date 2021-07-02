// Generated by Dagger (https://dagger.dev).
package com.nadi.nadimovies.ui.search;

import com.nadi.nadimovies.domain.movie.MovieUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<MovieUseCase> movieUseCaseProvider;

  public SearchViewModel_Factory(Provider<MovieUseCase> movieUseCaseProvider) {
    this.movieUseCaseProvider = movieUseCaseProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(movieUseCaseProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<MovieUseCase> movieUseCaseProvider) {
    return new SearchViewModel_Factory(movieUseCaseProvider);
  }

  public static SearchViewModel newInstance(MovieUseCase movieUseCase) {
    return new SearchViewModel(movieUseCase);
  }
}
