package com.virgin.money.di.modules;

import java.lang.System;

@kotlinx.coroutines.FlowPreview()
@kotlinx.coroutines.ExperimentalCoroutinesApi()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\fH\'J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u000eH\'\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/di/modules/MainBindingModule;", "", "()V", "bindFragmentFactory", "Landroidx/fragment/app/FragmentFactory;", "factory", "Lcom/virgin/money/di/factory/FragmentInjectionFactory;", "bindPeopleDetailsFragment", "Landroidx/fragment/app/Fragment;", "fragment", "Lcom/virgin/money/ui/people/PeopleDetailsFragment;", "bindPeopleFragment", "Lcom/virgin/money/ui/people/PeopleFragment;", "bindRoomFragment", "Lcom/virgin/money/ui/room/RoomFragment;", "app_debug"})
@dagger.Module()
public abstract class MainBindingModule {
    
    public MainBindingModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.virgin.money.di.scopes.FragmentKey(value = com.virgin.money.ui.people.PeopleFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment bindPeopleFragment(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.people.PeopleFragment fragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.virgin.money.di.scopes.FragmentKey(value = com.virgin.money.ui.people.PeopleDetailsFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment bindPeopleDetailsFragment(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.people.PeopleDetailsFragment fragment);
    
    @org.jetbrains.annotations.NotNull()
    @com.virgin.money.di.scopes.FragmentKey(value = com.virgin.money.ui.room.RoomFragment.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.fragment.app.Fragment bindRoomFragment(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.room.RoomFragment fragment);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.fragment.app.FragmentFactory bindFragmentFactory(@org.jetbrains.annotations.NotNull()
    com.virgin.money.di.factory.FragmentInjectionFactory factory);
}