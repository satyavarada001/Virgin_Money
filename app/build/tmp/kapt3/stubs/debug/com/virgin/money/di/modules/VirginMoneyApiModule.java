package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0007J\u001a\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\nH\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\rH\u0007J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0011H\u0007\u00a8\u0006\u0016"}, d2 = {"Lcom/virgin/money/di/modules/VirginMoneyApiModule;", "", "()V", "provideBaseUrl", "", "provideHttpLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "logger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "provideOkHttpClient", "Lokhttp3/OkHttpClient;", "logInterceptor", "provideRetrofitBuilder", "Lretrofit2/Retrofit$Builder;", "baseUrl", "mOkHttpClient", "provideRetrofitClient", "Lretrofit2/Retrofit;", "builder", "provideVirginMoneyApi", "Lcom/virgin/money/data/api/VirginMoneyApi;", "retrofit", "app_debug"})
@dagger.Module(includes = {com.virgin.money.di.modules.VirginMoneyApiBindingModule.class})
public final class VirginMoneyApiModule {
    
    public VirginMoneyApiModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    @dagger.Provides()
    public final java.lang.String provideBaseUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.logging.HttpLoggingInterceptor provideHttpLoggingInterceptor(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor.Logger logger) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final okhttp3.OkHttpClient provideOkHttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor logInterceptor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit.Builder provideRetrofitBuilder(@org.jetbrains.annotations.NotNull()
    @javax.inject.Named(value = "baseUrl")
    java.lang.String baseUrl, @org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient mOkHttpClient) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final retrofit2.Retrofit provideRetrofitClient(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit.Builder builder) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.virgin.money.data.api.VirginMoneyApi provideVirginMoneyApi(@org.jetbrains.annotations.NotNull()
    retrofit2.Retrofit retrofit) {
        return null;
    }
}