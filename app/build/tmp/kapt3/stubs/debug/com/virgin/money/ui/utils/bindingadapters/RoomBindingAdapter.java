package com.virgin.money.ui.utils.bindingadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\b\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\t\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\n"}, d2 = {"Lcom/virgin/money/ui/utils/bindingadapters/RoomBindingAdapter;", "", "()V", "bindMaxOccupancy", "", "Landroid/widget/TextView;", "room", "Lcom/virgin/money/data/models/Room;", "bindOccupancyStatus", "bindRoomNumber", "app_debug"})
public final class RoomBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.virgin.money.ui.utils.bindingadapters.RoomBindingAdapter INSTANCE = null;
    
    private RoomBindingAdapter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindRoomNumber"})
    public static final void bindRoomNumber(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindRoomNumber, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.Room room) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindOccupancyStatus"})
    public static final void bindOccupancyStatus(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindOccupancyStatus, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.Room room) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindMaxOccupancy"})
    public static final void bindMaxOccupancy(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindMaxOccupancy, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.Room room) {
    }
}