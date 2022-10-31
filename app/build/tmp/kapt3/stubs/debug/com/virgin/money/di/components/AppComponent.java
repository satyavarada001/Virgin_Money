package com.virgin.money.di.components;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/virgin/money/di/components/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/virgin/money/application/VirginMoneyApp;", "Factory", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.virgin.money.di.modules.VirginMoneyApiModule.class, com.virgin.money.di.modules.AppModule.class, com.virgin.money.di.modules.DataModule.class, com.virgin.money.di.modules.ActivityModule.class, com.virgin.money.di.modules.ViewModelModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.virgin.money.application.VirginMoneyApp> {
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"}, d2 = {"Lcom/virgin/money/di/components/AppComponent$Factory;", "Ldagger/android/AndroidInjector$Factory;", "Lcom/virgin/money/application/VirginMoneyApp;", "app_debug"})
    @dagger.Component.Factory()
    public static abstract interface Factory extends dagger.android.AndroidInjector.Factory<com.virgin.money.application.VirginMoneyApp> {
    }
}