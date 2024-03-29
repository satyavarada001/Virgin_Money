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
public final class RoomUseCase_Factory implements Factory<RoomUseCase> {
  private final Provider<VirginMoneyApi> virginMoneyApiProvider;

  public RoomUseCase_Factory(Provider<VirginMoneyApi> virginMoneyApiProvider) {
    this.virginMoneyApiProvider = virginMoneyApiProvider;
  }

  @Override
  public RoomUseCase get() {
    return newInstance(virginMoneyApiProvider.get());
  }

  public static RoomUseCase_Factory create(Provider<VirginMoneyApi> virginMoneyApiProvider) {
    return new RoomUseCase_Factory(virginMoneyApiProvider);
  }

  public static RoomUseCase newInstance(VirginMoneyApi virginMoneyApi) {
    return new RoomUseCase(virginMoneyApi);
  }
}
