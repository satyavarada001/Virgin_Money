// Generated by Dagger (https://dagger.dev).
package com.virgin.money.di.modules;

import androidx.lifecycle.MutableLiveData;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DataModule_ProvideIntegerMutableLiveDataFactory implements Factory<MutableLiveData<Integer>> {
  private final DataModule module;

  public DataModule_ProvideIntegerMutableLiveDataFactory(DataModule module) {
    this.module = module;
  }

  @Override
  public MutableLiveData<Integer> get() {
    return provideIntegerMutableLiveData(module);
  }

  public static DataModule_ProvideIntegerMutableLiveDataFactory create(DataModule module) {
    return new DataModule_ProvideIntegerMutableLiveDataFactory(module);
  }

  public static MutableLiveData<Integer> provideIntegerMutableLiveData(DataModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideIntegerMutableLiveData());
  }
}
