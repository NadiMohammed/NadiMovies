// Generated by Dagger (https://dagger.dev).
package com.nadi.data.repository;

import com.nadi.data.network.MovieAPIs;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SimilarRepositoryImplementer_Factory implements Factory<SimilarRepositoryImplementer> {
  private final Provider<MovieAPIs> movieAPIsProvider;

  public SimilarRepositoryImplementer_Factory(Provider<MovieAPIs> movieAPIsProvider) {
    this.movieAPIsProvider = movieAPIsProvider;
  }

  @Override
  public SimilarRepositoryImplementer get() {
    return newInstance(movieAPIsProvider.get());
  }

  public static SimilarRepositoryImplementer_Factory create(Provider<MovieAPIs> movieAPIsProvider) {
    return new SimilarRepositoryImplementer_Factory(movieAPIsProvider);
  }

  public static SimilarRepositoryImplementer newInstance(MovieAPIs movieAPIs) {
    return new SimilarRepositoryImplementer(movieAPIs);
  }
}
