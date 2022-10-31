// Generated by Dagger (https://dagger.dev).
package com.virgin.money.data.usecases;

import com.virgin.money.data.api.VirginMoneyApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class PeopleUseCase_Factory implements Factory<PeopleUseCase> {
  private final Provider<VirginMoneyApi> virginMoneyApiProvider;

  public PeopleUseCase_Factory(Provider<VirginMoneyApi> virginMoneyApiProvider) {
    this.virginMoneyApiProvider = virginMoneyApiProvider;
  }

  @Override
  public PeopleUseCase get() {
    return newInstance(virginMoneyApiProvider.get());
  }

  public static PeopleUseCase_Factory create(Provider<VirginMoneyApi> virginMoneyApiProvider) {
    return new PeopleUseCase_Factory(virginMoneyApiProvider);
  }

  public static PeopleUseCase newInstance(VirginMoneyApi virginMoneyApi) {
    return new PeopleUseCase(virginMoneyApi);
  }
}
