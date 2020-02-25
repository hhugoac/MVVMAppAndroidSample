package com.raywenderlich.wewatch.view.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0006H\u0016J\u000e\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\u0012\u0010\u0014\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u000eH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lcom/raywenderlich/wewatch/view/activities/MainActivity;", "Lcom/raywenderlich/wewatch/view/activities/BaseActivity;", "()V", "adapter", "Lcom/raywenderlich/wewatch/view/adapters/MovieListAdapter;", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "getToolbar", "()Landroidx/appcompat/widget/Toolbar;", "toolbar$delegate", "Lkotlin/Lazy;", "viewModel", "Lcom/raywenderlich/wewatch/viewmodel/MainViewModel;", "deleteMoviesClicked", "", "getToolbarInstance", "goToAddActivity", "view", "Landroid/view/View;", "hideLoading", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "showLoading", "app_debug"})
public final class MainActivity extends com.raywenderlich.wewatch.view.activities.BaseActivity {
    private final kotlin.Lazy toolbar$delegate = null;
    private final com.raywenderlich.wewatch.view.adapters.MovieListAdapter adapter = null;
    private com.raywenderlich.wewatch.viewmodel.MainViewModel viewModel;
    private java.util.HashMap _$_findViewCache;
    
    private final androidx.appcompat.widget.Toolbar getToolbar() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void showLoading() {
    }
    
    private final void hideLoading() {
    }
    
    private final void deleteMoviesClicked() {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public androidx.appcompat.widget.Toolbar getToolbarInstance() {
        return null;
    }
    
    public final void goToAddActivity(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull()
    android.view.MenuItem item) {
        return false;
    }
    
    public MainActivity() {
        super();
    }
}