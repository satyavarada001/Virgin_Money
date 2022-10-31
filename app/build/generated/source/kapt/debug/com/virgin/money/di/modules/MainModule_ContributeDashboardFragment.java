package com.virgin.money.di.modules;

import com.virgin.money.ui.room.RoomFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainModule_ContributeDashboardFragment.RoomFragmentSubcomponent.class)
public abstract class MainModule_ContributeDashboardFragment {
  private MainModule_ContributeDashboardFragment() {}

  @Binds
  @IntoMap
  @ClassKey(RoomFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      RoomFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface RoomFragmentSubcomponent extends AndroidInjector<RoomFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<RoomFragment> {}
  }
}
