package com.example.core.local;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.core.local.entity.GamesEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
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
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GamesDao_Impl implements GamesDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<GamesEntity> __insertionAdapterOfGamesEntity;

  private final EntityDeletionOrUpdateAdapter<GamesEntity> __deletionAdapterOfGamesEntity;

  public GamesDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGamesEntity = new EntityInsertionAdapter<GamesEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `games` (`id`,`rating`,`name`,`released`,`background_image`,`description`,`isFavorite`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GamesEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        stmt.bindDouble(2, value.getRating());
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getReleased() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getReleased());
        }
        if (value.getBackground_image() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getBackground_image());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDescription());
        }
        final int _tmp = value.isFavorite() ? 1 : 0;
        stmt.bindLong(7, _tmp);
      }
    };
    this.__deletionAdapterOfGamesEntity = new EntityDeletionOrUpdateAdapter<GamesEntity>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `games` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, GamesEntity value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
      }
    };
  }

  @Override
  public Object insertGames(final GamesEntity gamesEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfGamesEntity.insert(gamesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteGames(final GamesEntity gamesEntity,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfGamesEntity.handle(gamesEntity);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<GamesEntity>> getFavorite() {
    final String _sql = "SELECT * FROM games";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"games"}, new Callable<List<GamesEntity>>() {
      @Override
      public List<GamesEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfRating = CursorUtil.getColumnIndexOrThrow(_cursor, "rating");
          final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
          final int _cursorIndexOfReleased = CursorUtil.getColumnIndexOrThrow(_cursor, "released");
          final int _cursorIndexOfBackgroundImage = CursorUtil.getColumnIndexOrThrow(_cursor, "background_image");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfIsFavorite = CursorUtil.getColumnIndexOrThrow(_cursor, "isFavorite");
          final List<GamesEntity> _result = new ArrayList<GamesEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final GamesEntity _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final double _tmpRating;
            _tmpRating = _cursor.getDouble(_cursorIndexOfRating);
            final String _tmpName;
            if (_cursor.isNull(_cursorIndexOfName)) {
              _tmpName = null;
            } else {
              _tmpName = _cursor.getString(_cursorIndexOfName);
            }
            final String _tmpReleased;
            if (_cursor.isNull(_cursorIndexOfReleased)) {
              _tmpReleased = null;
            } else {
              _tmpReleased = _cursor.getString(_cursorIndexOfReleased);
            }
            final String _tmpBackground_image;
            if (_cursor.isNull(_cursorIndexOfBackgroundImage)) {
              _tmpBackground_image = null;
            } else {
              _tmpBackground_image = _cursor.getString(_cursorIndexOfBackgroundImage);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final boolean _tmpIsFavorite;
            final int _tmp;
            _tmp = _cursor.getInt(_cursorIndexOfIsFavorite);
            _tmpIsFavorite = _tmp != 0;
            _item = new GamesEntity(_tmpId,_tmpRating,_tmpName,_tmpReleased,_tmpBackground_image,_tmpDescription,_tmpIsFavorite);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
