package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H\'\u00a2\u0006\u0002\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/virgin/money/di/modules/BaseActivityModule;", "ACTIVITY", "Lcom/virgin/money/ui/base/BaseActivity;", "", "()V", "bindBaseActivity", "Landroid/app/Activity;", "activity", "(Lcom/virgin/money/ui/base/BaseActivity;)Landroid/app/Activity;", "app_debug"})
@dagger.Module()
public abstract class BaseActivityModule<ACTIVITY extends com.virgin.money.ui.base.BaseActivity> {
    
    public BaseActivityModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract android.app.Activity bindBaseActivity(@org.jetbrains.annotations.NotNull()
    ACTIVITY activity);
}