// Generated by Dagger (https://dagger.dev).
package com.virgin.money.di.modules;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class VirginMoneyApiModule_ProvideHttpLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final VirginMoneyApiModule module;

  private final Provider<HttpLoggingInterceptor.Logger> loggerProvider;

  public VirginMoneyApiModule_ProvideHttpLoggingInterceptorFactory(VirginMoneyApiModule module,
      Provider<HttpLoggingInterceptor.Logger> loggerProvider) {
    this.module = module;
    this.loggerProvider = loggerProvider;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideHttpLoggingInterceptor(module, loggerProvider.get());
  }

  public static VirginMoneyApiModule_ProvideHttpLoggingInterceptorFactory create(
      VirginMoneyApiModule module, Provider<HttpLoggingInterceptor.Logger> loggerProvider) {
    return new VirginMoneyApiModule_ProvideHttpLoggingInterceptorFactory(module, loggerProvider);
  }

  public static HttpLoggingInterceptor provideHttpLoggingInterceptor(VirginMoneyApiModule instance,
      HttpLoggingInterceptor.Logger logger) {
    return Preconditions.checkNotNullFromProvides(instance.provideHttpLoggingInterceptor(logger));
  }
}
