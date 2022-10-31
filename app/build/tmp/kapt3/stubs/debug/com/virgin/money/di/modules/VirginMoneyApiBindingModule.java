package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lcom/virgin/money/di/modules/VirginMoneyApiBindingModule;", "", "()V", "bindHttpLogger", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "httpLogger", "Lcom/virgin/money/data/api/HttpLogger;", "app_debug"})
@dagger.Module()
public abstract class VirginMoneyApiBindingModule {
    
    public VirginMoneyApiBindingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract okhttp3.logging.HttpLoggingInterceptor.Logger bindHttpLogger(@org.jetbrains.annotations.NotNull()
    com.virgin.money.data.api.HttpLogger httpLogger);
}