package com.virgin.money.ui.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0016J\u000e\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0007R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\t\"\u0004\b\u000f\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R0\u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u00110\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\t\"\u0004\b\u0015\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lcom/virgin/money/ui/room/RoomViewModel;", "Landroidx/lifecycle/ViewModel;", "roomUseCase", "Lcom/virgin/money/data/usecases/RoomUseCase;", "(Lcom/virgin/money/data/usecases/RoomUseCase;)V", "error", "Landroidx/lifecycle/MutableLiveData;", "", "getError", "()Landroidx/lifecycle/MutableLiveData;", "setError", "(Landroidx/lifecycle/MutableLiveData;)V", "loadingVisibility", "", "getLoadingVisibility", "setLoadingVisibility", "rooms", "Lcom/virgin/money/data/states/Result;", "", "Lcom/virgin/money/data/models/Room;", "getRooms", "setRooms", "", "visible", "app_debug"})
public final class RoomViewModel extends androidx.lifecycle.ViewModel {
    private final com.virgin.money.data.usecases.RoomUseCase roomUseCase = null;
    @javax.inject.Inject()
    public androidx.lifecycle.MutableLiveData<com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.Room>>> rooms;
    @javax.inject.Inject()
    public androidx.lifecycle.MutableLiveData<java.lang.Integer> loadingVisibility;
    @javax.inject.Inject()
    public androidx.lifecycle.MutableLiveData<java.lang.Boolean> error;
    
    @javax.inject.Inject()
    public RoomViewModel(@org.jetbrains.annotations.NotNull()
    com.virgin.money.data.usecases.RoomUseCase roomUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.Room>>> getRooms() {
        return null;
    }
    
    public final void setRooms(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.Room>>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Integer> getLoadingVisibility() {
        return null;
    }
    
    public final void setLoadingVisibility(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Integer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.lang.Boolean> getError() {
        return null;
    }
    
    public final void setError(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.MutableLiveData<java.lang.Boolean> p0) {
    }
    
    public final void getRooms() {
    }
    
    public final void setLoadingVisibility(boolean visible) {
    }
}