package com.nadi.nadimovies.ui.home;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.domain.movie.Movie;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class HomeFragmentDirections {
  private HomeFragmentDirections() {
  }

  @NonNull
  public static ActionHomeFragmentToDetailsFragment actionHomeFragmentToDetailsFragment(
      @Nullable Movie.Result movie) {
    return new ActionHomeFragmentToDetailsFragment(movie);
  }

  public static class ActionHomeFragmentToDetailsFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    private ActionHomeFragmentToDetailsFragment(@Nullable Movie.Result movie) {
      this.arguments.put("movie", movie);
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public ActionHomeFragmentToDetailsFragment setMovie(@Nullable Movie.Result movie) {
      this.arguments.put("movie", movie);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
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
    public int getActionId() {
      return R.id.action_homeFragment_to_detailsFragment;
    }

    @SuppressWarnings("unchecked")
    @Nullable
    public Movie.Result getMovie() {
      return (Movie.Result) arguments.get("movie");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionHomeFragmentToDetailsFragment that = (ActionHomeFragmentToDetailsFragment) object;
      if (arguments.containsKey("movie") != that.arguments.containsKey("movie")) {
        return false;
      }
      if (getMovie() != null ? !getMovie().equals(that.getMovie()) : that.getMovie() != null) {
        return false;
      }
      if (getActionId() != that.getActionId()) {
        return false;
      }
      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      result = 31 * result + (getMovie() != null ? getMovie().hashCode() : 0);
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionHomeFragmentToDetailsFragment(actionId=" + getActionId() + "){"
          + "movie=" + getMovie()
          + "}";
    }
  }
}
