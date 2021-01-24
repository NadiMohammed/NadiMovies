package com.nadi.nadimovies.ui.details;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.NavDirections;
import com.nadi.core.movie.Movie;
import com.nadi.nadimovies.R;
import java.io.Serializable;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class DetailsFragmentDirections {
  private DetailsFragmentDirections() {
  }

  @NonNull
  public static ActionDetailsFragmentToTrailerFragment actionDetailsFragmentToTrailerFragment(
      int movieID) {
    return new ActionDetailsFragmentToTrailerFragment(movieID);
  }

  @NonNull
  public static ActionDetailsFragmentSelf actionDetailsFragmentSelf(@Nullable Movie.Result movie) {
    return new ActionDetailsFragmentSelf(movie);
  }

  public static class ActionDetailsFragmentToTrailerFragment implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetailsFragmentToTrailerFragment(int movieID) {
      this.arguments.put("movieID", movieID);
    }

    @NonNull
    public ActionDetailsFragmentToTrailerFragment setMovieID(int movieID) {
      this.arguments.put("movieID", movieID);
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    @NonNull
    public Bundle getArguments() {
      Bundle __result = new Bundle();
      if (arguments.containsKey("movieID")) {
        int movieID = (int) arguments.get("movieID");
        __result.putInt("movieID", movieID);
      }
      return __result;
    }

    @Override
    public int getActionId() {
      return R.id.action_detailsFragment_to_trailerFragment;
    }

    @SuppressWarnings("unchecked")
    public int getMovieID() {
      return (int) arguments.get("movieID");
    }

    @Override
    public boolean equals(Object object) {
      if (this == object) {
          return true;
      }
      if (object == null || getClass() != object.getClass()) {
          return false;
      }
      ActionDetailsFragmentToTrailerFragment that = (ActionDetailsFragmentToTrailerFragment) object;
      if (arguments.containsKey("movieID") != that.arguments.containsKey("movieID")) {
        return false;
      }
      if (getMovieID() != that.getMovieID()) {
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
      result = 31 * result + getMovieID();
      result = 31 * result + getActionId();
      return result;
    }

    @Override
    public String toString() {
      return "ActionDetailsFragmentToTrailerFragment(actionId=" + getActionId() + "){"
          + "movieID=" + getMovieID()
          + "}";
    }
  }

  public static class ActionDetailsFragmentSelf implements NavDirections {
    private final HashMap arguments = new HashMap();

    private ActionDetailsFragmentSelf(@Nullable Movie.Result movie) {
      this.arguments.put("movie", movie);
    }

    @NonNull
    public ActionDetailsFragmentSelf setMovie(@Nullable Movie.Result movie) {
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
      return R.id.action_detailsFragment_self;
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
      ActionDetailsFragmentSelf that = (ActionDetailsFragmentSelf) object;
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
      return "ActionDetailsFragmentSelf(actionId=" + getActionId() + "){"
          + "movie=" + getMovie()
          + "}";
    }
  }
}
