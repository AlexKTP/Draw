package com.alex.draw.persistence.db.model;

import android.graphics.Bitmap;

public class Draw {

    private String name;
    private Bitmap bitmap;

    public Draw(String name, Bitmap bitmap) {
        this.name = name;
        this.bitmap = bitmap;
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
