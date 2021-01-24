package com.nadi.nadimovies;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.nadi.nadimovies.databinding.ActivityMainBindingImpl;
import com.nadi.nadimovies.databinding.DesignHomeViewpagerBindingImpl;
import com.nadi.nadimovies.databinding.DesignMoviesBindingImpl;
import com.nadi.nadimovies.databinding.DesignSimilarBindingImpl;
import com.nadi.nadimovies.databinding.FragmentDetailsBindingImpl;
import com.nadi.nadimovies.databinding.FragmentHomeBindingImpl;
import com.nadi.nadimovies.databinding.FragmentTrailerBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_DESIGNHOMEVIEWPAGER = 2;

  private static final int LAYOUT_DESIGNMOVIES = 3;

  private static final int LAYOUT_DESIGNSIMILAR = 4;

  private static final int LAYOUT_FRAGMENTDETAILS = 5;

  private static final int LAYOUT_FRAGMENTHOME = 6;

  private static final int LAYOUT_FRAGMENTTRAILER = 7;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(7);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.design_home_viewpager, LAYOUT_DESIGNHOMEVIEWPAGER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.design_movies, LAYOUT_DESIGNMOVIES);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.design_similar, LAYOUT_DESIGNSIMILAR);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.fragment_details, LAYOUT_FRAGMENTDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.fragment_home, LAYOUT_FRAGMENTHOME);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.nadi.nadimovies.R.layout.fragment_trailer, LAYOUT_FRAGMENTTRAILER);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DESIGNHOMEVIEWPAGER: {
          if ("layout/design_home_viewpager_0".equals(tag)) {
            return new DesignHomeViewpagerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for design_home_viewpager is invalid. Received: " + tag);
        }
        case  LAYOUT_DESIGNMOVIES: {
          if ("layout/design_movies_0".equals(tag)) {
            return new DesignMoviesBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for design_movies is invalid. Received: " + tag);
        }
        case  LAYOUT_DESIGNSIMILAR: {
          if ("layout/design_similar_0".equals(tag)) {
            return new DesignSimilarBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for design_similar is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDETAILS: {
          if ("layout/fragment_details_0".equals(tag)) {
            return new FragmentDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHOME: {
          if ("layout/fragment_home_0".equals(tag)) {
            return new FragmentHomeBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_home is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTTRAILER: {
          if ("layout/fragment_trailer_0".equals(tag)) {
            return new FragmentTrailerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_trailer is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(4);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "clickListener");
      sKeys.put(2, "movie");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(7);

    static {
      sKeys.put("layout/activity_main_0", com.nadi.nadimovies.R.layout.activity_main);
      sKeys.put("layout/design_home_viewpager_0", com.nadi.nadimovies.R.layout.design_home_viewpager);
      sKeys.put("layout/design_movies_0", com.nadi.nadimovies.R.layout.design_movies);
      sKeys.put("layout/design_similar_0", com.nadi.nadimovies.R.layout.design_similar);
      sKeys.put("layout/fragment_details_0", com.nadi.nadimovies.R.layout.fragment_details);
      sKeys.put("layout/fragment_home_0", com.nadi.nadimovies.R.layout.fragment_home);
      sKeys.put("layout/fragment_trailer_0", com.nadi.nadimovies.R.layout.fragment_trailer);
    }
  }
}
