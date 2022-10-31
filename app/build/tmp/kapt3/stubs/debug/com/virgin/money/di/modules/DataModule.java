package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004H\u0007J\u001a\u0010\b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t0\u0004H\u0007J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0007J\u001a\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\n0\t0\u0004H\u0007\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/di/modules/DataModule;", "", "()V", "provideBooleanMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "provideIntegerMutableLiveData", "", "providePeopleListMutableLiveData", "Lcom/virgin/money/data/states/Result;", "", "Lcom/virgin/money/data/models/People;", "providePeopleMutableLiveData", "provideRoomListMutableLiveData", "Lcom/virgin/money/data/models/Room;", "app_debug"})
@dagger.Module()
public final class DataModule {
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.People>>> providePeopleListMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<com.virgin.money.data.models.People> providePeopleMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.Room>>> provideRoomListMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> provideBooleanMutableLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> provideIntegerMutableLiveData() {
        return null;
    }
}