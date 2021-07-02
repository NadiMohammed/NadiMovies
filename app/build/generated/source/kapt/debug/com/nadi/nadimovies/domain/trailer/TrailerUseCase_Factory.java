// Generated by Dagger (https://dagger.dev).
package com.nadi.nadimovies.domain.trailer;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TrailerUseCase_Factory implements Factory<TrailerUseCase> {
  private final Provider<TrailerRepository> trailerRepositoryProvider;

  public TrailerUseCase_Factory(Provider<TrailerRepository> trailerRepositoryProvider) {
    this.trailerRepositoryProvider = trailerRepositoryProvider;
  }

  @Override
  public TrailerUseCase get() {
    return newInstance(trailerRepositoryProvider.get());
  }

  public static TrailerUseCase_Factory create(
      Provider<TrailerRepository> trailerRepositoryProvider) {
    return new TrailerUseCase_Factory(trailerRepositoryProvider);
  }

  public static TrailerUseCase newInstance(TrailerRepository trailerRepository) {
    return new TrailerUseCase(trailerRepository);
  }
}
