package com.virgin.money.ui.utils.bindingadapters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u0004*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\n\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0014\u0010\u000b\u001a\u00020\u0004*\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\f"}, d2 = {"Lcom/virgin/money/ui/utils/bindingadapters/PeopleBindingAdapter;", "", "()V", "bindPeopleAvatar", "", "Landroid/widget/ImageView;", "people", "Lcom/virgin/money/data/models/People;", "bindPeopleEmail", "Landroid/widget/TextView;", "bindPeopleJobTitle", "bindPeopleName", "app_debug"})
public final class PeopleBindingAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final com.virgin.money.ui.utils.bindingadapters.PeopleBindingAdapter INSTANCE = null;
    
    private PeopleBindingAdapter() {
        super();
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindPeopleName"})
    public static final void bindPeopleName(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindPeopleName, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.People people) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindPeopleEmail"})
    public static final void bindPeopleEmail(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindPeopleEmail, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.People people) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindPeopleJobTitle"})
    public static final void bindPeopleJobTitle(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$bindPeopleJobTitle, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.People people) {
    }
    
    @kotlin.jvm.JvmStatic()
    @androidx.databinding.BindingAdapter(value = {"bindPeopleAvatar"})
    public static final void bindPeopleAvatar(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$bindPeopleAvatar, @org.jetbrains.annotations.NotNull()
    com.virgin.money.data.models.People people) {
    }
}