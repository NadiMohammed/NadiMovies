package com.nadi.nadimovies.ui.trailer;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.navigation.NavArgs;
import java.lang.IllegalArgumentException;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;

public class TrailerFragmentArgs implements NavArgs {
  private final HashMap arguments = new HashMap();

  private TrailerFragmentArgs() {
  }

  @SuppressWarnings("unchecked")
  private TrailerFragmentArgs(HashMap argumentsMap) {
    this.arguments.putAll(argumentsMap);
  }

  @NonNull
  @SuppressWarnings("unchecked")
  public static TrailerFragmentArgs fromBundle(@NonNull Bundle bundle) {
    TrailerFragmentArgs __result = new TrailerFragmentArgs();
    bundle.setClassLoader(TrailerFragmentArgs.class.getClassLoader());
    if (bundle.containsKey("movieID")) {
      int movieID;
      movieID = bundle.getInt("movieID");
      __result.arguments.put("movieID", movieID);
    } else {
      throw new IllegalArgumentException("Required argument \"movieID\" is missing and does not have an android:defaultValue");
    }
    return __result;
  }

  @SuppressWarnings("unchecked")
  public int getMovieID() {
    return (int) arguments.get("movieID");
  }

  @SuppressWarnings("unchecked")
  @NonNull
  public Bundle toBundle() {
    Bundle __result = new Bundle();
    if (arguments.containsKey("movieID")) {
      int movieID = (int) arguments.get("movieID");
      __result.putInt("movieID", movieID);
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
    TrailerFragmentArgs that = (TrailerFragmentArgs) object;
    if (arguments.containsKey("movieID") != that.arguments.containsKey("movieID")) {
      return false;
    }
    if (getMovieID() != that.getMovieID()) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + getMovieID();
    return result;
  }

  @Override
  public String toString() {
    return "TrailerFragmentArgs{"
        + "movieID=" + getMovieID()
        + "}";
  }

  public static class Builder {
    private final HashMap arguments = new HashMap();

    @SuppressWarnings("unchecked")
    public Builder(TrailerFragmentArgs original) {
      this.arguments.putAll(original.arguments);
    }

    @SuppressWarnings("unchecked")
    public Builder(int movieID) {
      this.arguments.put("movieID", movieID);
    }

    @NonNull
    public TrailerFragmentArgs build() {
      TrailerFragmentArgs result = new TrailerFragmentArgs(arguments);
      return result;
    }

    @NonNull
    @SuppressWarnings("unchecked")
    public Builder setMovieID(int movieID) {
      this.arguments.put("movieID", movieID);
      return this;
    }

    @SuppressWarnings("unchecked")
    public int getMovieID() {
      return (int) arguments.get("movieID");
    }
  }
}
