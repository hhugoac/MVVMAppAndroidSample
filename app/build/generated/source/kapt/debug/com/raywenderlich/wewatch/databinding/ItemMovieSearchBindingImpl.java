package com.raywenderlich.wewatch.databinding;
import com.raywenderlich.wewatch.R;
import com.raywenderlich.wewatch.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemMovieSearchBindingImpl extends ItemMovieSearchBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.searchImageView, 3);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemMovieSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemMovieSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.searchReleaseDateTextView.setTag(null);
        this.searchTitleTextView.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.search == variableId) {
            setSearch((com.raywenderlich.wewatch.viewmodel.SearchViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setSearch(@Nullable com.raywenderlich.wewatch.viewmodel.SearchViewModel Search) {
        this.mSearch = Search;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.search);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeSearchTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeSearchReleaseDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeSearchTitle(androidx.databinding.ObservableField<java.lang.String> SearchTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeSearchReleaseDate(androidx.databinding.ObservableField<java.lang.String> SearchReleaseDate, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        androidx.databinding.ObservableField<java.lang.String> searchTitle = null;
        com.raywenderlich.wewatch.viewmodel.SearchViewModel search = mSearch;
        java.lang.String searchTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> searchReleaseDate = null;
        java.lang.String searchReleaseDateGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (search != null) {
                        // read search.title
                        searchTitle = search.getTitle();
                    }
                    updateRegistration(0, searchTitle);


                    if (searchTitle != null) {
                        // read search.title.get()
                        searchTitleGet = searchTitle.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (search != null) {
                        // read search.releaseDate
                        searchReleaseDate = search.getReleaseDate();
                    }
                    updateRegistration(1, searchReleaseDate);


                    if (searchReleaseDate != null) {
                        // read search.releaseDate.get()
                        searchReleaseDateGet = searchReleaseDate.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchReleaseDateTextView, searchReleaseDateGet);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.searchTitleTextView, searchTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): search.title
        flag 1 (0x2L): search.releaseDate
        flag 2 (0x3L): search
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}