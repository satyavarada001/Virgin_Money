package com.virgin.money.di.modules;

import com.virgin.money.ui.people.PeopleDetailsFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents = MainModule_ContributeNotificationsFragment.PeopleDetailsFragmentSubcomponent.class
)
public abstract class MainModule_ContributeNotificationsFragment {
  private MainModule_ContributeNotificationsFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PeopleDetailsFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PeopleDetailsFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PeopleDetailsFragmentSubcomponent
      extends AndroidInjector<PeopleDetailsFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PeopleDetailsFragment> {}
  }
}
