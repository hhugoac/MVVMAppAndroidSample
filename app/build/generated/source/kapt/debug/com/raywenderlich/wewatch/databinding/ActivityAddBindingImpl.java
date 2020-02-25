package com.raywenderlich.wewatch.databinding;
import com.raywenderlich.wewatch.R;
import com.raywenderlich.wewatch.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityAddBindingImpl extends ActivityAddBinding implements com.raywenderlich.wewatch.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar_view, 4);
        sViewsWithIds.put(R.id.imageButton, 5);
    }
    // views
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityAddBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private ActivityAddBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.constraintlayout.widget.ConstraintLayout) bindings[0]
            , (android.widget.Button) bindings[3]
            , (android.widget.ImageButton) bindings[5]
            , (android.widget.EditText) bindings[1]
            , (android.view.View) bindings[4]
            , (android.widget.EditText) bindings[2]
            );
        this.addLayout.setTag(null);
        this.addMovieButton.setTag(null);
        this.titleEditText.setTag(null);
        this.yearEditText.setTag(null);
        setRootTag(root);
        // listeners
        mCallback1 = new com.raywenderlich.wewatch.generated.callback.OnClickListener(this, 1);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.raywenderlich.wewatch.viewmodel.AddViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.raywenderlich.wewatch.viewmodel.AddViewModel ViewModel) {
        this.mViewModel = ViewModel;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.viewModel);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeViewModelTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeViewModelReleaseDate((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelTitle(androidx.databinding.ObservableField<java.lang.String> ViewModelTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelReleaseDate(androidx.databinding.ObservableField<java.lang.String> ViewModelReleaseDate, int fieldId) {
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
        java.lang.String viewModelTitleGet = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelTitle = null;
        androidx.databinding.ObservableField<java.lang.String> viewModelReleaseDate = null;
        java.lang.String viewModelReleaseDateGet = null;
        com.raywenderlich.wewatch.viewmodel.AddViewModel viewModel = mViewModel;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.title
                        viewModelTitle = viewModel.getTitle();
                    }
                    updateRegistration(0, viewModelTitle);


                    if (viewModelTitle != null) {
                        // read viewModel.title.get()
                        viewModelTitleGet = viewModelTitle.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.releaseDate
                        viewModelReleaseDate = viewModel.getReleaseDate();
                    }
                    updateRegistration(1, viewModelReleaseDate);


                    if (viewModelReleaseDate != null) {
                        // read viewModel.releaseDate.get()
                        viewModelReleaseDateGet = viewModelReleaseDate.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            this.addMovieButton.setOnClickListener(mCallback1);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.titleEditText, viewModelTitleGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.yearEditText, viewModelReleaseDateGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // viewModel
        com.raywenderlich.wewatch.viewmodel.AddViewModel viewModel = mViewModel;
        // viewModel != null
        boolean viewModelJavaLangObjectNull = false;



        viewModelJavaLangObjectNull = (viewModel) != (null);
        if (viewModelJavaLangObjectNull) {


            viewModel.saveMovie();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.title
        flag 1 (0x2L): viewModel.releaseDate
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}