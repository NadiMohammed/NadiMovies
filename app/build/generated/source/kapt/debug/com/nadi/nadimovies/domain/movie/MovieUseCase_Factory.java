// Generated by Dagger (https://dagger.dev).
package com.nadi.nadimovies.domain.movie;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MovieUseCase_Factory implements Factory<MovieUseCase> {
  private final Provider<MovieRepository> movieGatewayProvider;

  public MovieUseCase_Factory(Provider<MovieRepository> movieGatewayProvider) {
    this.movieGatewayProvider = movieGatewayProvider;
  }

  @Override
  public MovieUseCase get() {
    return newInstance(movieGatewayProvider.get());
  }

  public static MovieUseCase_Factory create(Provider<MovieRepository> movieGatewayProvider) {
    return new MovieUseCase_Factory(movieGatewayProvider);
  }

  public static MovieUseCase newInstance(MovieRepository movieGateway) {
    return new MovieUseCase(movieGateway);
  }
}
