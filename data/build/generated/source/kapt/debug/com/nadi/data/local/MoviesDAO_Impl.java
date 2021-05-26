package com.nadi.data.local;

import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Double;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

@SuppressWarnings({"unchecked", "deprecation"})
public final class MoviesDAO_Impl implements MoviesDAO {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<DatabaseMovie> __insertionAdapterOfDatabaseMovie;

  private final EntityDeletionOrUpdateAdapter<DatabaseMovie> __deletionAdapterOfDatabaseMovie;

  private final EntityDeletionOrUpdateAdapter<DatabaseMovie> __updateAdapterOfDatabaseMovie;

  private final SharedSQLiteStatement __preparedStmtOfClear;

  public MoviesDAO_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfDatabaseMovie = new EntityInsertionAdapter<DatabaseMovie>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `movies` (`title`,`posterPath`,`voteAverage`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseMovie value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPosterPath());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getVoteAverage());
        }
      }
    };
    this.__deletionAdapterOfDatabaseMovie = new EntityDeletionOrUpdateAdapter<DatabaseMovie>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `movies` WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseMovie value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
      }
    };
    this.__updateAdapterOfDatabaseMovie = new EntityDeletionOrUpdateAdapter<DatabaseMovie>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `movies` SET `title` = ?,`posterPath` = ?,`voteAverage` = ? WHERE `title` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, DatabaseMovie value) {
        if (value.getTitle() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getTitle());
        }
        if (value.getPosterPath() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPosterPath());
        }
        if (value.getVoteAverage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindDouble(3, value.getVoteAverage());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getTitle());
        }
      }
    };
    this.__preparedStmtOfClear = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM movies";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final List<DatabaseMovie> databaseMovie,
      final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfDatabaseMovie.insert(databaseMovie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object delete(final DatabaseMovie databaseMovie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfDatabaseMovie.handle(databaseMovie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object update(final DatabaseMovie databaseMovie, final Continuation<? super Unit> p1) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfDatabaseMovie.handle(databaseMovie);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, p1);
  }

  @Override
  public Object clear(final Continuation<? super Unit> p0) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClear.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfClear.release(_stmt);
        }
      }
    }, p0);
  }

  @Override
  public Object get(final Continuation<? super List<DatabaseMovie>> p0) {
    final String _sql = "SELECT * FROM movies";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    final CancellationSignal _cancellationSignal = DBUtil.createCancellationSignal();
    return CoroutinesRoom.execute(__db, false, _cancellationSignal, new Callable<List<DatabaseMovie>>() {
      @Override
      public List<DatabaseMovie> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfPosterPath = CursorUtil.getColumnIndexOrThrow(_cursor, "posterPath");
          final int _cursorIndexOfVoteAverage = CursorUtil.getColumnIndexOrThrow(_cursor, "voteAverage");
          final List<DatabaseMovie> _result = new ArrayList<DatabaseMovie>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final DatabaseMovie _item;
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpPosterPath;
            if (_cursor.isNull(_cursorIndexOfPosterPath)) {
              _tmpPosterPath = null;
            } else {
              _tmpPosterPath = _cursor.getString(_cursorIndexOfPosterPath);
            }
            final Double _tmpVoteAverage;
            if (_cursor.isNull(_cursorIndexOfVoteAverage)) {
              _tmpVoteAverage = null;
            } else {
              _tmpVoteAverage = _cursor.getDouble(_cursorIndexOfVoteAverage);
            }
            _item = new DatabaseMovie(_tmpTitle,_tmpPosterPath,_tmpVoteAverage);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
          _statement.release();
        }
      }
    }, p0);
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
