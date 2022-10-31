package com.virgin.money.coroutines;

import java.lang.System;

/**
 * A custom wrapper of the [kotlinx.coroutines.Dispatchers].
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u0004H\u0007J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0004H\u0007J\u0010\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u0004H\u0007J\u0010\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u0004H\u0007R\u0011\u0010\u0003\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u000e\u0010\r\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/virgin/money/coroutines/CoroutineDispatcherWrapper;", "", "()V", "Default", "Lkotlinx/coroutines/CoroutineDispatcher;", "getDefault", "()Lkotlinx/coroutines/CoroutineDispatcher;", "IO", "getIO", "Main", "getMain", "Unconfined", "getUnconfined", "default", "io", "main", "unconfined", "setDefault", "", "setIO", "setMain", "setUnconfined", "app_debug"})
public final class CoroutineDispatcherWrapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.virgin.money.coroutines.CoroutineDispatcherWrapper INSTANCE = null;
    private static kotlinx.coroutines.CoroutineDispatcher main;
    private static kotlinx.coroutines.CoroutineDispatcher unconfined;
    private static kotlinx.coroutines.CoroutineDispatcher io;
    
    private CoroutineDispatcherWrapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getDefault() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getMain() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getUnconfined() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.CoroutineDispatcher getIO() {
        return null;
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setDefault(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher p0_772401952) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setMain(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher main) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setUnconfined(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher unconfined) {
    }
    
    @androidx.annotation.VisibleForTesting()
    public final void setIO(@org.jetbrains.annotations.NotNull()
    kotlinx.coroutines.CoroutineDispatcher io) {
    }
}