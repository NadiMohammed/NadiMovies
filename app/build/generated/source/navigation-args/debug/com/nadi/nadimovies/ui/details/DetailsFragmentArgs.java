package com.nadi.nadimovies.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavArgs;
import com.nadi.core.movie.Movie;
import java.io.Serializable;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private DetailsFragmentArgs() {
  }

  private DetailsFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static DetailsFragmentArgs fromBundle(@NonNull Bundle bundle) {
    DetailsFragmentArgs __result = new DetailsFragmentArgs();
    bundle.setClassLoader(DetailsFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movie")) {
      Movie.Result movie;
      if (Parcelable.class.isAssignableFrom(Movie.Result.class) || Serializable.class.isAssignableFrom(Movie.Result.class)) {
        movie = (Movie.Result) bundle.get("movie");
      } else {
        throw new UnsupportedOperationException(Movie.Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
      __result.arguments.put("movie", movie);
    } else {
      throw new IllegalArgumentException("Required argument \"movie\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  @Nullable
  public Movie.Result getMovie() {
    return (Movie.Result) arguments.get("movie");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("movie")) {
      Movie.Result movie = (Movie.Result) arguments.get("movie");
      if (Parcelable.class.isAssignableFrom(Movie.Result.class) || movie == null) {
        __result.putParcelable("movie", Parcelable.class.cast(movie));
      } else if (Serializable.class.isAssignableFrom(Movie.Result.class)) {
        __result.putSerializable("movie", Serializable.class.cast(movie));
      } else {
        throw new UnsupportedOperationException(Movie.Result.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
      }
    }
    return __result;
  }

  @Override
  public boolean equals(Object object) {
    if (this == object) {
        return true;
    }
    if (object == null || getClass() != object.getClass()) {
        return false;
    }
    DetailsFragmentArgs that = (DetailsFragmentArgs) object;
    if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
      return false;
    }
    if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
    return result;
  }

  @Override
  public String toString() {
    return "DetailsFragmentArgs{"
        + "movie=" + getMovie()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    public Builder(DetailsFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    public Builder(@Nullable Movie.Result movie) {
      this.arguments.put("movie", movie);
    }

    @NonNull
    public DetailsFragmentArgs build() {
      DetailsFragmentArgs result = new DetailsFragmentArgs(arguments);
      return result;
    }

    @NonNull
    public Builder setMovie(@Nullable Movie.Result movie) {
      this.arguments.put("movie", movie);
      return this;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Movie.Result getMovie() {
      return (Movie.Result) arguments.get("movie");
    }
  }
}
