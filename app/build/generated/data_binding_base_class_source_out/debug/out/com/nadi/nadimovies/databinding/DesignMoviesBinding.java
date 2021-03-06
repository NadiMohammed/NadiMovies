// Generated by view binder compiler. Do not edit!
package com.nadi.nadimovies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.nadi.nadimovies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DesignMoviesBinding implements ViewBinding {
  @NonNull
  private final CardView rootView;

  @NonNull
  public final ShapeableImageView movieImg;

  @NonNull
  public final TextView movieNameTxt;

  @NonNull
  public final ShapeableImageView rateIcon;

  @NonNull
  public final MaterialTextView rateTxt;

  private DesignMoviesBinding(@NonNull CardView rootView, @NonNull ShapeableImageView movieImg,
      @NonNull TextView movieNameTxt, @NonNull ShapeableImageView rateIcon,
      @NonNull MaterialTextView rateTxt) {
    this.rootView = rootView;
    this.movieImg = movieImg;
    this.movieNameTxt = movieNameTxt;
    this.rateIcon = rateIcon;
    this.rateTxt = rateTxt;
  }

  @Override
  @NonNull
  public CardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DesignMoviesBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DesignMoviesBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.design_movies, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DesignMoviesBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.movieImg;
      ShapeableImageView movieImg = rootView.findViewById(id);
      if (movieImg == null) {
        break missingId;
      }

      id = R.id.movieNameTxt;
      TextView movieNameTxt = rootView.findViewById(id);
      if (movieNameTxt == null) {
        break missingId;
      }

      id = R.id.rateIcon;
      ShapeableImageView rateIcon = rootView.findViewById(id);
      if (rateIcon == null) {
        break missingId;
      }

      id = R.id.rateTxt;
      MaterialTextView rateTxt = rootView.findViewById(id);
      if (rateTxt == null) {
        break missingId;
      }

      return new DesignMoviesBinding((CardView) rootView, movieImg, movieNameTxt, rateIcon,
          rateTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
