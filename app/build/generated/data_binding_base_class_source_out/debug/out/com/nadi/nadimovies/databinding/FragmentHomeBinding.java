// Generated by view binder compiler. Do not edit!
package com.nadi.nadimovies.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewpager2.widget.ViewPager2;
import com.nadi.nadimovies.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentHomeBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final RecyclerView nowPlayingRecycler;

  @NonNull
  public final TextView nowPlayingText;

  @NonNull
  public final ViewPager2 viewPager;

  private FragmentHomeBinding(@NonNull ScrollView rootView,
      @NonNull RecyclerView nowPlayingRecycler, @NonNull TextView nowPlayingText,
      @NonNull ViewPager2 viewPager) {
    this.rootView = rootView;
    this.nowPlayingRecycler = nowPlayingRecycler;
    this.nowPlayingText = nowPlayingText;
    this.viewPager = viewPager;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentHomeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_home, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentHomeBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.nowPlayingRecycler;
      RecyclerView nowPlayingRecycler = rootView.findViewById(id);
      if (nowPlayingRecycler == null) {
        break missingId;
      }

      id = R.id.nowPlayingText;
      TextView nowPlayingText = rootView.findViewById(id);
      if (nowPlayingText == null) {
        break missingId;
      }

      id = R.id.viewPager;
      ViewPager2 viewPager = rootView.findViewById(id);
      if (viewPager == null) {
        break missingId;
      }

      return new FragmentHomeBinding((ScrollView) rootView, nowPlayingRecycler, nowPlayingText,
          viewPager);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
