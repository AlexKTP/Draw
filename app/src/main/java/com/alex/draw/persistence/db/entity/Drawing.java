package com.alex.draw.persistence.db.entity;

import android.graphics.Bitmap;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "drawing")
public class Drawing {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "drawing_id")
    private Long id;

    @ColumnInfo(name = "drawing_name")
    private String name;

    @ColumnInfo(name = "drawing_bitmap")
    private Bitmap bitmap;

    public Drawing(@NonNull String name, @NonNull Bitmap bitmap){
        this.name = name;
        this.bitmap = bitmap;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }
}
