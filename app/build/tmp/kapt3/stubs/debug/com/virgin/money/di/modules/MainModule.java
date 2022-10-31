package com.virgin.money.di.modules;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u0006\u001a\u00020\u0007H\'J\b\u0010\b\u001a\u00020\tH\'\u00a8\u0006\n"}, d2 = {"Lcom/virgin/money/di/modules/MainModule;", "Lcom/virgin/money/di/modules/BaseActivityModule;", "Lcom/virgin/money/ui/main/MainActivity;", "()V", "contributeDashboardFragment", "Lcom/virgin/money/ui/room/RoomFragment;", "contributeHomeFragment", "Lcom/virgin/money/ui/people/PeopleFragment;", "contributeNotificationsFragment", "Lcom/virgin/money/ui/people/PeopleDetailsFragment;", "app_debug"})
@dagger.Module()
public abstract class MainModule extends com.virgin.money.di.modules.BaseActivityModule<com.virgin.money.ui.main.MainActivity> {
    
    public MainModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.virgin.money.ui.people.PeopleFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.virgin.money.ui.room.RoomFragment contributeDashboardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract com.virgin.money.ui.people.PeopleDetailsFragment contributeNotificationsFragment();
}