// Generated by Dagger (https://dagger.dev).
package com.virgin.money.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import retrofit2.Retrofit;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VirginMoneyApiModule_ProvideRetrofitClientFactory implements Factory<Retrofit> {
  private final VirginMoneyApiModule module;

  private final Provider<Retrofit.Builder> builderProvider;

  public VirginMoneyApiModule_ProvideRetrofitClientFactory(VirginMoneyApiModule module,
      Provider<Retrofit.Builder> builderProvider) {
    this.module = module;
    this.builderProvider = builderProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofitClient(module, builderProvider.get());
  }

  public static VirginMoneyApiModule_ProvideRetrofitClientFactory create(
      VirginMoneyApiModule module, Provider<Retrofit.Builder> builderProvider) {
    return new VirginMoneyApiModule_ProvideRetrofitClientFactory(module, builderProvider);
  }

  public static Retrofit provideRetrofitClient(VirginMoneyApiModule instance,
      Retrofit.Builder builder) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofitClient(builder));
  }
}
