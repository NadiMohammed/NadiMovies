// Generated by view binder compiler. Do not edit!
package com.nadi.nadimovies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textview.MaterialTextView;
import com.nadi.nadimovies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DesignHomeViewpagerBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final ShapeableImageView movieImg;

  @NonNull
  public final MaterialTextView movieNameTxt;

  private DesignHomeViewpagerBinding(@NonNull MaterialCardView rootView,
      @NonNull ShapeableImageView movieImg, @NonNull MaterialTextView movieNameTxt) {
    this.rootView = rootView;
    this.movieImg = movieImg;
    this.movieNameTxt = movieNameTxt;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static DesignHomeViewpagerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DesignHomeViewpagerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.design_home_viewpager, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DesignHomeViewpagerBinding bind(@NonNull View rootView) {
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
      MaterialTextView movieNameTxt = rootView.findViewById(id);
      if (movieNameTxt == null) {
        break missingId;
      }

      return new DesignHomeViewpagerBinding((MaterialCardView) rootView, movieImg, movieNameTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
