package com.virgin.money.data.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/virgin/money/data/repositories/PeopleRepository;", "Lcom/virgin/money/data/repositories/BaseRepository;", "Lkotlinx/coroutines/CoroutineScope;", "virginMoneyApi", "Lcom/virgin/money/data/api/VirginMoneyApi;", "(Lcom/virgin/money/data/api/VirginMoneyApi;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "getPeoples", "Lcom/virgin/money/data/states/Result;", "", "Lcom/virgin/money/data/models/People;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PeopleRepository extends com.virgin.money.data.repositories.BaseRepository implements kotlinx.coroutines.CoroutineScope {
    private final com.virgin.money.data.api.VirginMoneyApi virginMoneyApi = null;
    
    @javax.inject.Inject()
    public PeopleRepository(@org.jetbrains.annotations.NotNull()
    com.virgin.money.data.api.VirginMoneyApi virginMoneyApi) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPeoples(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.People>>> continuation) {
        return null;
    }
}