package com.raywenderlich.wewatch.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u000eH\u0002J\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014J\u0006\u0010\u0015\u001a\u00020\u0016R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\t\"\u0004\b\u0011\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lcom/raywenderlich/wewatch/viewmodel/AddViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/raywenderlich/wewatch/data/MovieRepository;", "(Lcom/raywenderlich/wewatch/data/MovieRepository;)V", "releaseDate", "Landroidx/databinding/ObservableField;", "", "getReleaseDate", "()Landroidx/databinding/ObservableField;", "setReleaseDate", "(Landroidx/databinding/ObservableField;)V", "saveLiveData", "Landroidx/lifecycle/MutableLiveData;", "", "title", "getTitle", "setTitle", "canSaveMovie", "getSaveLiveDate", "Landroidx/lifecycle/LiveData;", "saveMovie", "", "app_debug"})
public final class AddViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> title;
    @org.jetbrains.annotations.NotNull()
    private androidx.databinding.ObservableField<java.lang.String> releaseDate;
    private final androidx.lifecycle.MutableLiveData<java.lang.Boolean> saveLiveData = null;
    private final com.raywenderlich.wewatch.data.MovieRepository repository = null;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.databinding.ObservableField<java.lang.String> getReleaseDate() {
        return null;
    }
    
    public final void setReleaseDate(@org.jetbrains.annotations.NotNull()
    androidx.databinding.ObservableField<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.lang.Boolean> getSaveLiveDate() {
        return null;
    }
    
    public final void saveMovie() {
    }
    
    private final boolean canSaveMovie() {
        return false;
    }
    
    public AddViewModel(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.wewatch.data.MovieRepository repository) {
        super();
    }
    
    public AddViewModel() {
        super();
    }
}