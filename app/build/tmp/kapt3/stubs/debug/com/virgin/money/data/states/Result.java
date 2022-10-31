package com.virgin.money.data.states;

import java.lang.System;

/**
 * A generic class that contains data and status/states about loading this data.
 */
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u0016*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0005\u0016\u0017\u0018\u0019\u001aB1\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\u0002\u0010\tJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u0012J\u0006\u0010\u0014\u001a\u00020\u0012J\u0006\u0010\u0015\u001a\u00020\u0012R\u0015\u0010\u0003\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0019\u0010\u0006\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u0082\u0001\u0004\u001b\u001c\u001d\u001e\u00a8\u0006\u001f"}, d2 = {"Lcom/virgin/money/data/states/Result;", "T", "", "data", "message", "", "error", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Exception;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getError", "()Ljava/lang/Exception;", "getMessage", "()Ljava/lang/String;", "isError", "", "isLoading", "isNone", "isSuccess", "Companion", "Error", "Loading", "None", "Success", "Lcom/virgin/money/data/states/Result$Error;", "Lcom/virgin/money/data/states/Result$Loading;", "Lcom/virgin/money/data/states/Result$None;", "Lcom/virgin/money/data/states/Result$Success;", "app_debug"})
public abstract class Result<T extends java.lang.Object> {
    @org.jetbrains.annotations.Nullable()
    private final T data = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Exception error = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.virgin.money.data.states.Result.Companion Companion = null;
    
    private Result(T data, java.lang.String message, java.lang.Exception error) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final T getData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Exception getError() {
        return null;
    }
    
    /**
     * @return TRUE if the instance is of [Loading].
     */
    public final boolean isLoading() {
        return false;
    }
    
    /**
     * @return TRUE if the instance is of [Success].
     */
    public final boolean isSuccess() {
        return false;
    }
    
    /**
     * @return TRUE if the instance is of [Error].
     */
    public final boolean isError() {
        return false;
    }
    
    /**
     * @return TRUE if the instance is of [None].
     */
    public final boolean isNone() {
        return false;
    }
    
    /**
     * This class represents the successful status/state of the data being loaded.
     *
     * @param data data being loaded.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u000f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/virgin/money/data/states/Result$Success;", "T", "Lcom/virgin/money/data/states/Result;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Success<T extends java.lang.Object> extends com.virgin.money.data.states.Result<T> {
        
        public Success(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    /**
     * This class represents the loading status/state of the data being loaded.
     *
     * @param data data being loaded.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0011\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/virgin/money/data/states/Result$Loading;", "T", "Lcom/virgin/money/data/states/Result;", "data", "(Ljava/lang/Object;)V", "app_debug"})
    public static final class Loading<T extends java.lang.Object> extends com.virgin.money.data.states.Result<T> {
        
        public Loading() {
            super(null, null, null);
        }
        
        public Loading(@org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    /**
     * This class represents the error status/state of the data being loaded.
     *
     * @param exception the error.
     * @param data data being loaded.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001d\u0012\n\u0010\u0003\u001a\u00060\u0004j\u0002`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/virgin/money/data/states/Result$Error;", "T", "Lcom/virgin/money/data/states/Result;", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "(Ljava/lang/Exception;Ljava/lang/Object;)V", "app_debug"})
    public static final class Error<T extends java.lang.Object> extends com.virgin.money.data.states.Result<T> {
        
        public Error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        T data) {
            super(null, null, null);
        }
    }
    
    /**
     * This is used to specify no state or unspecified state.
     * UI should not do anything in response to this.
     */
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003\u00a8\u0006\u0004"}, d2 = {"Lcom/virgin/money/data/states/Result$None;", "T", "Lcom/virgin/money/data/states/Result;", "()V", "app_debug"})
    public static final class None<T extends java.lang.Object> extends com.virgin.money.data.states.Result<T> {
        
        public None() {
            super(null, null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J/\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\nJ#\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u0005J#\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00050\u0004\"\u0004\b\u0001\u0010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u0001H\u0005\u00a2\u0006\u0002\u0010\f\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/data/states/Result$Companion;", "", "()V", "error", "Lcom/virgin/money/data/states/Result;", "T", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "data", "(Ljava/lang/Exception;Ljava/lang/Object;)Lcom/virgin/money/data/states/Result;", "loading", "(Ljava/lang/Object;)Lcom/virgin/money/data/states/Result;", "none", "success", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        /**
         * Create a successful status with data.
         *
         * @param data data successfully loaded.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.virgin.money.data.states.Result<T> success(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        /**
         * Create an error status with optional data.
         *
         * @param error the error.
         * @param data optional data.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.virgin.money.data.states.Result<T> error(@org.jetbrains.annotations.NotNull()
        java.lang.Exception exception, @org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        /**
         * Create a loading status with the optional data.
         *
         * @param data optional data.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.virgin.money.data.states.Result<T> loading(@org.jetbrains.annotations.Nullable()
        T data) {
            return null;
        }
        
        /**
         * Create a None result type.
         */
        @org.jetbrains.annotations.NotNull()
        public final <T extends java.lang.Object>com.virgin.money.data.states.Result<T> none() {
            return null;
        }
    }
}