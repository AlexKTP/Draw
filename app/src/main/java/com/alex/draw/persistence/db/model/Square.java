package com.alex.draw.persistence.db.model;

import android.util.Log;

public class Square extends Shape {

    @Override
    public void draw() {
        Log.d(TAG, "draw: Square " + super.toString());
    }
}
