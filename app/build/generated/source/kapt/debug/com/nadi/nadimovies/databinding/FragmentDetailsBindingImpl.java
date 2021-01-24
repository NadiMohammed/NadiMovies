package com.nadi.nadimovies.databinding;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDetailsBindingImpl extends FragmentDetailsBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.playImg, 7);
        sViewsWithIds.put(R.id.overlayView, 8);
        sViewsWithIds.put(R.id.dateImg, 9);
        sViewsWithIds.put(R.id.rateImg, 10);
        sViewsWithIds.put(R.id.nowPlayingText, 11);
    }
    // views
    @NonNull
    private final android.widget.ScrollView mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDetailsBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private FragmentDetailsBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[11]
            , (android.view.View) bindings[8]
            , (android.widget.TextView) bindings[5]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            );
        this.mboundView0 = (android.widget.ScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.movieImg.setTag(null);
        this.movieNameTxt.setTag(null);
        this.overviewTxt.setTag(null);
        this.rateTxt.setTag(null);
        this.releaseDateTxt.setTag(null);
        this.similarMoviesRecycler.setTag(null);
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
            setViewModel((com.nadi.nadimovies.ui.details.DetailsViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setViewModel(@Nullable com.nadi.nadimovies.ui.details.DetailsViewModel ViewModel) {
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
                return onChangeViewModelProperty((androidx.lifecycle.LiveData<com.nadi.core.movie.Movie>) object, fieldId);
            case 1 :
                return onChangeViewModelSelectedMovie((androidx.lifecycle.LiveData<com.nadi.core.movie.Movie.Result>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeViewModelProperty(androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> ViewModelProperty, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeViewModelSelectedMovie(androidx.lifecycle.LiveData<com.nadi.core.movie.Movie.Result> ViewModelSelectedMovie, int fieldId) {
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
        java.lang.String viewModelSelectedMovieVoteAverageToString = null;
        java.lang.String viewModelSelectedMovieReleaseDate = null;
        java.lang.String viewModelSelectedMoviePosterPath = null;
        java.util.List<com.nadi.core.movie.Movie.Result> viewModelPropertyResults = null;
        com.nadi.core.movie.Movie.Result viewModelSelectedMovieGetValue = null;
        java.lang.Double viewModelSelectedMovieVoteAverage = null;
        java.lang.String viewModelSelectedMovieTitle = null;
        java.lang.String viewModelSelectedMovieOverview = null;
        androidx.lifecycle.LiveData<com.nadi.core.movie.Movie> viewModelProperty = null;
        com.nadi.core.movie.Movie viewModelPropertyGetValue = null;
        com.nadi.nadimovies.ui.details.DetailsViewModel viewModel = mViewModel;
        androidx.lifecycle.LiveData<com.nadi.core.movie.Movie.Result> viewModelSelectedMovie = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.property
                        viewModelProperty = viewModel.getProperty();
                    }
                    updateLiveDataRegistration(0, viewModelProperty);


                    if (viewModelProperty != null) {
                        // read viewModel.property.getValue()
                        viewModelPropertyGetValue = viewModelProperty.getValue();
                    }


                    if (viewModelPropertyGetValue != null) {
                        // read viewModel.property.getValue().results
                        viewModelPropertyResults = viewModelPropertyGetValue.getResults();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (viewModel != null) {
                        // read viewModel.selectedMovie
                        viewModelSelectedMovie = viewModel.getSelectedMovie();
                    }
                    updateLiveDataRegistration(1, viewModelSelectedMovie);


                    if (viewModelSelectedMovie != null) {
                        // read viewModel.selectedMovie.getValue()
                        viewModelSelectedMovieGetValue = viewModelSelectedMovie.getValue();
                    }


                    if (viewModelSelectedMovieGetValue != null) {
                        // read viewModel.selectedMovie.getValue().release_date
                        viewModelSelectedMovieReleaseDate = viewModelSelectedMovieGetValue.getRelease_date();
                        // read viewModel.selectedMovie.getValue().poster_path
                        viewModelSelectedMoviePosterPath = viewModelSelectedMovieGetValue.getPoster_path();
                        // read viewModel.selectedMovie.getValue().vote_average
                        viewModelSelectedMovieVoteAverage = viewModelSelectedMovieGetValue.getVote_average();
                        // read viewModel.selectedMovie.getValue().title
                        viewModelSelectedMovieTitle = viewModelSelectedMovieGetValue.getTitle();
                        // read viewModel.selectedMovie.getValue().overview
                        viewModelSelectedMovieOverview = viewModelSelectedMovieGetValue.getOverview();
                    }


                    if (viewModelSelectedMovieVoteAverage != null) {
                        // read viewModel.selectedMovie.getValue().vote_average.toString()
                        viewModelSelectedMovieVoteAverageToString = viewModelSelectedMovieVoteAverage.toString();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.nadi.nadimovies.util.BindingAdapterKt.bindImage(this.movieImg, viewModelSelectedMoviePosterPath);
            com.nadi.nadimovies.util.BindingAdapterKt.setNameFormatted(this.movieNameTxt, viewModelSelectedMovieTitle);
            com.nadi.nadimovies.util.BindingAdapterKt.setNameFormatted(this.overviewTxt, viewModelSelectedMovieOverview);
            com.nadi.nadimovies.util.BindingAdapterKt.setRate(this.rateTxt, viewModelSelectedMovieVoteAverageToString);
            com.nadi.nadimovies.util.BindingAdapterKt.setNameFormatted(this.releaseDateTxt, viewModelSelectedMovieReleaseDate);
        }
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.nadi.nadimovies.util.BindingAdapterKt.bindSimilarPhotosImage(this.similarMoviesRecycler, viewModelPropertyResults);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): viewModel.property
        flag 1 (0x2L): viewModel.selectedMovie
        flag 2 (0x3L): viewModel
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}