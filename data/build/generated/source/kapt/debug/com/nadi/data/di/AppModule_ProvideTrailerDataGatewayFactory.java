// Generated by Dagger (https://dagger.dev).
package com.nadi.data.di;

import com.nadi.core.trailer.TrailerGateway;
import com.nadi.data.network.MovieAPIs;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideTrailerDataGatewayFactory implements Factory<TrailerGateway> {
  private final Provider<MovieAPIs> movieAPIsProvider;

  public AppModule_ProvideTrailerDataGatewayFactory(Provider<MovieAPIs> movieAPIsProvider) {
    this.movieAPIsProvider = movieAPIsProvider;
  }

  @Override
  public TrailerGateway get() {
    return provideTrailerDataGateway(movieAPIsProvider.get());
  }

  public static AppModule_ProvideTrailerDataGatewayFactory create(
      Provider<MovieAPIs> movieAPIsProvider) {
    return new AppModule_ProvideTrailerDataGatewayFactory(movieAPIsProvider);
  }

  public static TrailerGateway provideTrailerDataGateway(MovieAPIs movieAPIs) {
    return Preconditions.checkNotNullFromProvides(AppModule.INSTANCE.provideTrailerDataGateway(movieAPIs));
  }
}