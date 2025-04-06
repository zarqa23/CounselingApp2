package com.android.doctorapp;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.android.doctorapp.databinding.ActivityEditProfileBindingImpl;
import com.android.doctorapp.databinding.ActivityModuleDetailsBindingImpl;
import com.android.doctorapp.databinding.LayoutDoubleCardLayoutBindingImpl;
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
  private static final int LAYOUT_ACTIVITYEDITPROFILE = 1;

  private static final int LAYOUT_ACTIVITYMODULEDETAILS = 2;

  private static final int LAYOUT_LAYOUTDOUBLECARDLAYOUT = 3;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(3);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.doctorapp.R.layout.activity_edit_profile, LAYOUT_ACTIVITYEDITPROFILE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.doctorapp.R.layout.activity_module_details, LAYOUT_ACTIVITYMODULEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.android.doctorapp.R.layout.layout_double_card_layout, LAYOUT_LAYOUTDOUBLECARDLAYOUT);
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
        case  LAYOUT_ACTIVITYEDITPROFILE: {
          if ("layout/activity_edit_profile_0".equals(tag)) {
            return new ActivityEditProfileBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_edit_profile is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMODULEDETAILS: {
          if ("layout/activity_module_details_0".equals(tag)) {
            return new ActivityModuleDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_module_details is invalid. Received: " + tag);
        }
        case  LAYOUT_LAYOUTDOUBLECARDLAYOUT: {
          if ("layout/layout_double_card_layout_0".equals(tag)) {
            return new LayoutDoubleCardLayoutBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for layout_double_card_layout is invalid. Received: " + tag);
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
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(3);

    static {
      sKeys.put("layout/activity_edit_profile_0", com.android.doctorapp.R.layout.activity_edit_profile);
      sKeys.put("layout/activity_module_details_0", com.android.doctorapp.R.layout.activity_module_details);
      sKeys.put("layout/layout_double_card_layout_0", com.android.doctorapp.R.layout.layout_double_card_layout);
    }
  }
}
