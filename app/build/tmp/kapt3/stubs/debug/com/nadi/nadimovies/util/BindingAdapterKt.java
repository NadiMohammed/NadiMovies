package com.nadi.nadimovies.util;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.databinding.BindingAdapter;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.ViewPager2;
import com.bumptech.glide.Glide;
import com.nadi.core.movie.Movie;
import com.nadi.nadimovies.R;
import com.nadi.nadimovies.ui.details.SimilarAdapter;
import com.nadi.nadimovies.ui.home.HomeAdapter;

@kotlin.Metadata(mv = {1, 4, 1}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\u001a\u0016\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u001a\u001c\u0010\n\u001a\u00020\u0001*\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0007\u001a\u001c\u0010\u000e\u001a\u00020\u0001*\u00020\u000f2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0007\u001a\u0016\u0010\u0011\u001a\u00020\u0001*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u0016\u0010\u0014\u001a\u00020\u0001*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007\u001a\u001b\u0010\u0015\u001a\u00020\u0001*\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0016H\u0007\u00a2\u0006\u0002\u0010\u0017\u00a8\u0006\u0018"}, d2 = {"bindImage", "", "Landroid/widget/ImageView;", "imgUrl", "", "bindPhotosImage", "Landroidx/recyclerview/widget/RecyclerView;", "data", "", "Lcom/nadi/core/movie/Movie$Result;", "bindSimilarPhotosImage", "bindStatus", "status", "Lcom/nadi/nadimovies/util/ApiStatus;", "bindViewPager", "Landroidx/viewpager2/widget/ViewPager2;", "movies", "setNameFormatted", "Landroid/widget/TextView;", "item", "setRate", "setVoteAverage", "", "(Landroid/widget/TextView;Ljava/lang/Double;)V", "app_debug"})
public final class BindingAdapterKt {
    
    @androidx.databinding.BindingAdapter(value = {"imageUrl"})
    public static final void bindImage(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$bindImage, @org.jetbrains.annotations.Nullable()
    java.lang.String imgUrl) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"apiStatus"})
    public static final void bindStatus(@org.jetbrains.annotations.NotNull()
    android.widget.ImageView $this$bindStatus, @org.jetbrains.annotations.NotNull()
    com.nadi.nadimovies.util.ApiStatus status) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"listData"})
    public static final void bindPhotosImage(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindPhotosImage, @org.jetbrains.annotations.Nullable()
    java.util.List<com.nadi.core.movie.Movie.Result> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"similarListData"})
    public static final void bindSimilarPhotosImage(@org.jetbrains.annotations.NotNull()
    androidx.recyclerview.widget.RecyclerView $this$bindSimilarPhotosImage, @org.jetbrains.annotations.Nullable()
    java.util.List<com.nadi.core.movie.Movie.Result> data) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"textName"})
    public static final void setNameFormatted(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setNameFormatted, @org.jetbrains.annotations.Nullable()
    java.lang.String item) {
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    @androidx.databinding.BindingAdapter(value = {"textRate"})
    public static final void setRate(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setRate, @org.jetbrains.annotations.Nullable()
    java.lang.String item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"voteAverage"})
    public static final void setVoteAverage(@org.jetbrains.annotations.NotNull()
    android.widget.TextView $this$setVoteAverage, @org.jetbrains.annotations.Nullable()
    java.lang.Double item) {
    }
    
    @androidx.databinding.BindingAdapter(value = {"bindViewPager"})
    public static final void bindViewPager(@org.jetbrains.annotations.NotNull()
    androidx.viewpager2.widget.ViewPager2 $this$bindViewPager, @org.jetbrains.annotations.Nullable()
    java.util.List<com.nadi.core.movie.Movie.Result> movies) {
    }
}