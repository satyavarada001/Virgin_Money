package com.virgin.money.ui.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B8\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u000eH\u0016J\u0018\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0016J\u0014\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R)\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u000b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/virgin/money/ui/adapter/PeopleAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/virgin/money/ui/adapter/PeopleAdapter$PeopleViewHolder;", "mList", "", "Lcom/virgin/money/data/models/People;", "onPeopleClickListener", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "people", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setPeoples", "peopleList", "PeopleViewHolder", "app_debug"})
public final class PeopleAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.virgin.money.ui.adapter.PeopleAdapter.PeopleViewHolder> {
    private java.util.List<com.virgin.money.data.models.People> mList;
    private final kotlin.jvm.functions.Function1<com.virgin.money.data.models.People, kotlin.Unit> onPeopleClickListener = null;
    
    public PeopleAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.virgin.money.data.models.People> mList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.virgin.money.data.models.People, kotlin.Unit> onPeopleClickListener) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.virgin.money.ui.adapter.PeopleAdapter.PeopleViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.virgin.money.ui.adapter.PeopleAdapter.PeopleViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setPeoples(@org.jetbrains.annotations.NotNull()
    java.util.List<com.virgin.money.data.models.People> peopleList) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB2\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0015\u0010\f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0006H\u0000\u00a2\u0006\u0002\b\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R)\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0006\u00a2\u0006\f\b\u0007\u0012\b\b\b\u0012\u0004\b\b(\t\u0012\u0004\u0012\u00020\n0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/ui/adapter/PeopleAdapter$PeopleViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/virgin/money/databinding/RecyclerItemPeopleBinding;", "onPeopleClickListener", "Lkotlin/Function1;", "Lcom/virgin/money/data/models/People;", "Lkotlin/ParameterName;", "name", "people", "", "(Lcom/virgin/money/databinding/RecyclerItemPeopleBinding;Lkotlin/jvm/functions/Function1;)V", "bind", "bind$app_debug", "Companion", "app_debug"})
    public static final class PeopleViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.virgin.money.databinding.RecyclerItemPeopleBinding binding = null;
        private final kotlin.jvm.functions.Function1<com.virgin.money.data.models.People, kotlin.Unit> onPeopleClickListener = null;
        @org.jetbrains.annotations.NotNull()
        public static final com.virgin.money.ui.adapter.PeopleAdapter.PeopleViewHolder.Companion Companion = null;
        
        public PeopleViewHolder(@org.jetbrains.annotations.NotNull()
        com.virgin.money.databinding.RecyclerItemPeopleBinding binding, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.virgin.money.data.models.People, kotlin.Unit> onPeopleClickListener) {
            super(null);
        }
        
        public final void bind$app_debug(@org.jetbrains.annotations.NotNull()
        com.virgin.money.data.models.People people) {
        }
        
        @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J8\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t\u00a2\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\r0\bH\u0000\u00a2\u0006\u0002\b\u000e\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/ui/adapter/PeopleAdapter$PeopleViewHolder$Companion;", "", "()V", "create", "Lcom/virgin/money/ui/adapter/PeopleAdapter$PeopleViewHolder;", "parent", "Landroid/view/ViewGroup;", "onPeopleClickListener", "Lkotlin/Function1;", "Lcom/virgin/money/data/models/People;", "Lkotlin/ParameterName;", "name", "people", "", "create$app_debug", "app_debug"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            @org.jetbrains.annotations.NotNull()
            public final com.virgin.money.ui.adapter.PeopleAdapter.PeopleViewHolder create$app_debug(@org.jetbrains.annotations.NotNull()
            android.view.ViewGroup parent, @org.jetbrains.annotations.NotNull()
            kotlin.jvm.functions.Function1<? super com.virgin.money.data.models.People, kotlin.Unit> onPeopleClickListener) {
                return null;
            }
        }
    }
}