package com.raywenderlich.wewatch;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.raywenderlich.wewatch.databinding.ActivityAddBindingImpl;
import com.raywenderlich.wewatch.databinding.ItemMovieMainBindingImpl;
import com.raywenderlich.wewatch.databinding.ItemMovieSearchBindingImpl;
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
  private static final int LAYOUT_ACTIVITYADD = 1;

  private static final int LAYOUT_ITEMMOVIEMAIN = 2;

  private static final int LAYOUT_ITEMMOVIESEARCH = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.raywenderlich.wewatch.R.layout.activity_add, LAYOUT_ACTIVITYADD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.raywenderlich.wewatch.R.layout.item_movie_main, LAYOUT_ITEMMOVIEMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.raywenderlich.wewatch.R.layout.item_movie_search, LAYOUT_ITEMMOVIESEARCH);
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
        case  LAYOUT_ACTIVITYADD: {
          if ("layout/activity_add_0".equals(tag)) {
            return new ActivityAddBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_add is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIEMAIN: {
          if ("layout/item_movie_main_0".equals(tag)) {
            return new ItemMovieMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMMOVIESEARCH: {
          if ("layout/item_movie_search_0".equals(tag)) {
            return new ItemMovieSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_movie_search is invalid. Received: " + tag);
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
      sKeys.put(1, "movie");
      sKeys.put(2, "search");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_add_0", com.raywenderlich.wewatch.R.layout.activity_add);
      sKeys.put("layout/item_movie_main_0", com.raywenderlich.wewatch.R.layout.item_movie_main);
      sKeys.put("layout/item_movie_search_0", com.raywenderlich.wewatch.R.layout.item_movie_search);
    }
  }
}
