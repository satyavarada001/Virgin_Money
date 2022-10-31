package com.virgin.money;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.virgin.money.databinding.ActivityMainBindingImpl;
import com.virgin.money.databinding.FragmentPeopleBindingImpl;
import com.virgin.money.databinding.FragmentPeopleDetailsBindingImpl;
import com.virgin.money.databinding.FragmentRoomBindingImpl;
import com.virgin.money.databinding.RecyclerItemPeopleBindingImpl;
import com.virgin.money.databinding.RecyclerItemRoomBindingImpl;
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

  private static final int LAYOUT_FRAGMENTPEOPLE = 2;

  private static final int LAYOUT_FRAGMENTPEOPLEDETAILS = 3;

  private static final int LAYOUT_FRAGMENTROOM = 4;

  private static final int LAYOUT_RECYCLERITEMPEOPLE = 5;

  private static final int LAYOUT_RECYCLERITEMROOM = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.fragment_people, LAYOUT_FRAGMENTPEOPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.fragment_people_details, LAYOUT_FRAGMENTPEOPLEDETAILS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.fragment_room, LAYOUT_FRAGMENTROOM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.recycler_item_people, LAYOUT_RECYCLERITEMPEOPLE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.virgin.money.R.layout.recycler_item_room, LAYOUT_RECYCLERITEMROOM);
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
        case  LAYOUT_FRAGMENTPEOPLE: {
          if ("layout/fragment_people_0".equals(tag)) {
            return new FragmentPeopleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_people is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTPEOPLEDETAILS: {
          if ("layout/fragment_people_details_0".equals(tag)) {
            return new FragmentPeopleDetailsBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_people_details is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTROOM: {
          if ("layout/fragment_room_0".equals(tag)) {
            return new FragmentRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_room is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERITEMPEOPLE: {
          if ("layout/recycler_item_people_0".equals(tag)) {
            return new RecyclerItemPeopleBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_item_people is invalid. Received: " + tag);
        }
        case  LAYOUT_RECYCLERITEMROOM: {
          if ("layout/recycler_item_room_0".equals(tag)) {
            return new RecyclerItemRoomBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for recycler_item_room is invalid. Received: " + tag);
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
      sKeys.put(1, "people");
      sKeys.put(2, "room");
      sKeys.put(3, "viewModel");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/activity_main_0", com.virgin.money.R.layout.activity_main);
      sKeys.put("layout/fragment_people_0", com.virgin.money.R.layout.fragment_people);
      sKeys.put("layout/fragment_people_details_0", com.virgin.money.R.layout.fragment_people_details);
      sKeys.put("layout/fragment_room_0", com.virgin.money.R.layout.fragment_room);
      sKeys.put("layout/recycler_item_people_0", com.virgin.money.R.layout.recycler_item_people);
      sKeys.put("layout/recycler_item_room_0", com.virgin.money.R.layout.recycler_item_room);
    }
  }
}
