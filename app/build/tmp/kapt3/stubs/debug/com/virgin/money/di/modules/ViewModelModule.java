package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\'\u00a8\u0006\u000e"}, d2 = {"Lcom/virgin/money/di/modules/ViewModelModule;", "", "()V", "bindPeopleViewModel", "Landroidx/lifecycle/ViewModel;", "peopleViewModel", "Lcom/virgin/money/ui/people/PeopleViewModel;", "bindRoomViewModel", "roomViewModel", "Lcom/virgin/money/ui/room/RoomViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lcom/virgin/money/di/factory/ViewModelFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.virgin.money.di.scopes.ViewModelKey(value = com.virgin.money.ui.room.RoomViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindRoomViewModel(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.room.RoomViewModel roomViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @com.virgin.money.di.scopes.ViewModelKey(value = com.virgin.money.ui.people.PeopleViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindPeopleViewModel(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.people.PeopleViewModel peopleViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    com.virgin.money.di.factory.ViewModelFactory factory);
}