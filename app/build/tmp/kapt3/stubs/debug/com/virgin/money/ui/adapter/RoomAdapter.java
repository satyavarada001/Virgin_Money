package com.virgin.money.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u0015\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\u0014\u0010\u0011\u001a\u00020\n2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/virgin/money/ui/adapter/RoomAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/virgin/money/ui/adapter/RoomAdapter$RoomViewHolder;", "mList", "", "Lcom/virgin/money/data/models/Room;", "(Ljava/util/List;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setRooms", "roomList", "RoomViewHolder", "app_debug"})
public final class RoomAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.virgin.money.ui.adapter.RoomAdapter.RoomViewHolder> {
    private java.util.List<com.virgin.money.data.models.Room> mList;
    
    public RoomAdapter() {
        super();
    }
    
    public RoomAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.virgin.money.data.models.Room> mList) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.virgin.money.ui.adapter.RoomAdapter.RoomViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.adapter.RoomAdapter.RoomViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setRooms(@org.jetbrains.annotations.NotNull()
    java.util.List<com.virgin.money.data.models.Room> roomList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000\u00a2\u0006\u0002\b\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/virgin/money/ui/adapter/RoomAdapter$RoomViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/virgin/money/databinding/RecyclerItemRoomBinding;", "(Lcom/virgin/money/databinding/RecyclerItemRoomBinding;)V", "bind", "", "room", "Lcom/virgin/money/data/models/Room;", "bind$app_debug", "Companion", "app_debug"})
    public static final class RoomViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.virgin.money.databinding.RecyclerItemRoomBinding binding = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.virgin.money.ui.adapter.RoomAdapter.RoomViewHolder.Companion Companion = null;
        
        public RoomViewHolder(@org.jetbrains.annotations.NotNull()
        com.virgin.money.databinding.RecyclerItemRoomBinding binding) {
            super(null);
        }
        
        public final void bind$app_debug(@org.jetbrains.annotations.NotNull()
        com.virgin.money.data.models.Room room) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\u0007\u00a8\u0006\b"}, d2 = {"Lcom/virgin/money/ui/adapter/RoomAdapter$RoomViewHolder$Companion;", "", "()V", "create", "Lcom/virgin/money/ui/adapter/RoomAdapter$RoomViewHolder;", "parent", "Landroid/view/ViewGroup;", "create$app_debug", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.virgin.money.ui.adapter.RoomAdapter.RoomViewHolder create$app_debug(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent) {
                return null;
            }
        }
    }
}