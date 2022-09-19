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

    @ColumnInfo(name = "drawing_base64img")
    private String base64img;

    public Drawing(@NonNull String name, @NonNull String base64img){
        this.name = name;
        this.base64img = base64img;
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

    public String getBase64img() {
        return base64img;
    }

    public void setBase64img(String base64img) {
        this.base64img = base64img;
    }
}
