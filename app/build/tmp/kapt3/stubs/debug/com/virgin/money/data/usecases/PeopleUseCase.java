package com.virgin.money.data.usecases;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00030\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ7\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\f\"\u00020\u0002H\u0094@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/virgin/money/data/usecases/PeopleUseCase;", "Lcom/virgin/money/data/usecases/BaseUseCase;", "", "Lkotlinx/coroutines/flow/Flow;", "Lcom/virgin/money/data/states/Result;", "", "Lcom/virgin/money/data/models/People;", "virginMoneyApi", "Lcom/virgin/money/data/api/VirginMoneyApi;", "(Lcom/virgin/money/data/api/VirginMoneyApi;)V", "execute", "params", "", "([Lkotlin/Unit;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class PeopleUseCase extends com.virgin.money.data.usecases.BaseUseCase<kotlin.Unit, kotlinx.coroutines.flow.Flow<? extends com.virgin.money.data.states.Result<java.util.List<? extends com.virgin.money.data.models.People>>>> {
    private final com.virgin.money.data.api.VirginMoneyApi virginMoneyApi = null;
    
    @javax.inject.Inject()
    public PeopleUseCase(@org.jetbrains.annotations.NotNull()
    com.virgin.money.data.api.VirginMoneyApi virginMoneyApi) {
        super(null);
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    protected java.lang.Object execute(@org.jetbrains.annotations.NotNull()
    kotlin.Unit[] params, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.virgin.money.data.states.Result<java.util.List<com.virgin.money.data.models.People>>>> continuation) {
        return null;
    }
}