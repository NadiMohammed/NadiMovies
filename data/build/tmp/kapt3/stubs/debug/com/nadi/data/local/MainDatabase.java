package com.nadi.data.local;

import java.lang.System;

@androidx.room.Database(entities = {com.nadi.data.local.DatabaseMovie.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0012\u0010\u0003\u001a\u00020\u0004X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/nadi/data/local/MainDatabase;", "Landroidx/room/RoomDatabase;", "()V", "moviesDAO", "Lcom/nadi/data/local/MoviesDAO;", "getMoviesDAO", "()Lcom/nadi/data/local/MoviesDAO;", "Companion", "data_debug"})
public abstract class MainDatabase extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull()
    public static final com.nadi.data.local.MainDatabase.Companion Companion = null;
    private static volatile com.nadi.data.local.MainDatabase INSTANCE;
    
    public MainDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.nadi.data.local.MoviesDAO getMoviesDAO();
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/nadi/data/local/MainDatabase$Companion;", "", "()V", "INSTANCE", "Lcom/nadi/data/local/MainDatabase;", "getInstance", "context", "Landroid/content/Context;", "data_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.nadi.data.local.MainDatabase getInstance(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
    }
}