package com.nadi.nadimovies.databinding;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DesignMoviesBindingImpl extends DesignMoviesBinding implements com.nadi.nadimovies.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rateIcon, 4);
    }
    // views
    @NonNull
    private final androidx.cardview.widget.CardView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DesignMoviesBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DesignMoviesBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (androidx.cardview.widget.CardView) bindings[0];
        this.mboundView0.setTag(null);
        this.movieImg.setTag(null);
        this.movieNameTxt.setTag(null);
        this.rateTxt.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.nadi.nadimovies.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x4L;
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
        if (BR.movie == variableId) {
            setMovie((com.nadi.core.movie.Movie.Result) variable);
        }
        else if (BR.clickListener == variableId) {
            setClickListener((com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setMovie(@Nullable com.nadi.core.movie.Movie.Result Movie) {
        this.mMovie = Movie;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.movie);
        super.requestRebind();
    }
    public void setClickListener(@Nullable com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener ClickListener) {
        this.mClickListener = ClickListener;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.clickListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        com.nadi.core.movie.Movie.Result movie = mMovie;
        com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener clickListener = mClickListener;
        java.lang.String moviePosterPath = null;
        java.lang.Double movieVoteAverage = null;
        java.lang.String movieTitle = null;

        if ((dirtyFlags & 0x5L) != 0) {



                if (movie != null) {
                    // read movie.poster_path
                    moviePosterPath = movie.getPoster_path();
                    // read movie.vote_average
                    movieVoteAverage = movie.getVote_average();
                    // read movie.title
                    movieTitle = movie.getTitle();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x4L) != 0) {
            // api target 1

            this.mboundView0.setOnClickListener(mCallback2);
        }
        if ((dirtyFlags & 0x5L) != 0) {
            // api target 1

            com.nadi.nadimovies.util.BindingAdapterKt.bindImage(this.movieImg, moviePosterPath);
            com.nadi.nadimovies.util.BindingAdapterKt.setNameFormatted(this.movieNameTxt, movieTitle);
            com.nadi.nadimovies.util.BindingAdapterKt.setVoteAverage(this.rateTxt, movieVoteAverage);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // movie
        com.nadi.core.movie.Movie.Result movie = mMovie;
        // clickListener
        com.nadi.nadimovies.ui.home.HomeAdapter.OnMovieClickListener clickListener = mClickListener;
        // clickListener != null
        boolean clickListenerJavaLangObjectNull = false;



        clickListenerJavaLangObjectNull = (clickListener) != (null);
        if (clickListenerJavaLangObjectNull) {



            clickListener.onMovieItemClick(movie);
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): movie
        flag 1 (0x2L): clickListener
        flag 2 (0x3L): null
    flag mapping end*/
    //end
}