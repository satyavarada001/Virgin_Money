package com.virgin.money.application;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u0006H\u0014J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/virgin/money/application/VirginMoneyApp;", "Ldagger/android/support/DaggerApplication;", "()V", "appComponent", "Lcom/virgin/money/di/components/AppComponent;", "applicationInjector", "Ldagger/android/AndroidInjector;", "initImageUtils", "", "onCreate", "app_debug"})
public final class VirginMoneyApp extends dagger.android.support.DaggerApplication {
    private com.virgin.money.di.components.AppComponent appComponent;
    
    public VirginMoneyApp() {
        super();
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected dagger.android.AndroidInjector<? extends dagger.android.support.DaggerApplication> applicationInjector() {
        return null;
    }
    
    private final void initImageUtils() {
    }
}