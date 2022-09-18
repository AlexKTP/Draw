package com.alex.draw.persistence.db;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.alex.draw.persistence.db.dao.DrawingDao;
import com.alex.draw.persistence.db.entity.Drawing;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Database(entities = {Drawing.class}, version = 1)
public abstract class DrawDataBase extends RoomDatabase {

    public abstract DrawingDao drawingDao();

    private static volatile DrawDataBase INSTANCE;
    private static final int NUMBER_OF_THREAD = 4;
    public static final ExecutorService databaseWriteExecutor = Executors.newFixedThreadPool(NUMBER_OF_THREAD);

    public static DrawDataBase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (DrawDataBase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            DrawDataBase.class, "draw_db")
                            .build();
                }
            }
        }
        return INSTANCE;
    }
}

