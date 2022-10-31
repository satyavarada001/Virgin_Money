package com.virgin.money.di.modules;

import com.virgin.money.ui.people.PeopleFragment;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module(subcomponents = MainModule_ContributeHomeFragment.PeopleFragmentSubcomponent.class)
public abstract class MainModule_ContributeHomeFragment {
  private MainModule_ContributeHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(PeopleFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      PeopleFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface PeopleFragmentSubcomponent extends AndroidInjector<PeopleFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<PeopleFragment> {}
  }
}
