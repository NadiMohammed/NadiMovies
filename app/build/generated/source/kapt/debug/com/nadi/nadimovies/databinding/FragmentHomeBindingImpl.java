package com.nadi.nadimovies.databinding;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentHomeBindingImpl extends FragmentHomeBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.nowPlayingText, 4);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    @NonNull
    private final android.widget.ImageView mboundView3;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentHomeBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentHomeBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            , (android.widget.TextView) bindings[4]
            , (androidx.viewpager2.widget.ViewPager2) bindings[1]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.ImageView) bindings[3];
        this.mboundView3.setTag(null);
        this.nowPlayingRecycler.setTag(null);
        this.viewPager.setTag(null);
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
        if (BR.viewModel == variableId) {
            setViewModel((com.nadi.nadimovies.ui.home.HomeViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.nadi.nadimovies.ui.home.HomeViewModel ViewModel) {
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
                return onChangeViewModelStatus((androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus>) object, fieldId);
            case 1 :
                return onChangeViewModelProperty((androidx.lifecycle.LiveData<com.nadi.core.movie.Movie>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelStatus(androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus> ViewModelStatus, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelProperty(androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> ViewModelProperty, int fieldId) {
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
        androidx.lifecycle.LiveData<com.nadi.nadimovies.util.ApiStatus> viewModelStatus = null;
        com.nadi.nadimovies.util.ApiStatus viewModelStatusGetValue = null;
        androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> viewModelProperty = null;
        com.nadi.core.movie.Movie viewModelPropertyGetValue = null;
        com.nadi.nadimovies.ui.home.HomeViewModel viewModel = mViewModel;
        java.util.List<com.nadi.core.movie.Movie.Result> viewModelPropertyResults = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.status
                        viewModelStatus = viewModel.getStatus();
                    }
                    updateLiveDataRegistration(0, viewModelStatus);


                    if (viewModelStatus != null) {
                        // read viewModel.status.getValue()
                        viewModelStatusGetValue = viewModelStatus.getValue();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.property
                        viewModelProperty = viewModel.getProperty();
                    }
                    updateLiveDataRegistration(1, viewModelProperty);


                    if (viewModelProperty != null) {
                        // read viewModel.property.getValue()
                        viewModelPropertyGetValue = viewModelProperty.getValue();
                    }


                    if (viewModelPropertyGetValue != null) {
                        // read viewModel.property.getValue().results
                        viewModelPropertyResults = viewModelPropertyGetValue.getResults();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.nadi.nadimovies.util.BindingAdapterKt.bindStatus(this.mboundView3, viewModelStatusGetValue);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.nadi.nadimovies.util.BindingAdapterKt.bindPhotosImage(this.nowPlayingRecycler, viewModelPropertyResults);
            com.nadi.nadimovies.util.BindingAdapterKt.bindViewPager(this.viewPager, viewModelPropertyResults);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.status
        flag 1 (0x2L): viewModel.property
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}