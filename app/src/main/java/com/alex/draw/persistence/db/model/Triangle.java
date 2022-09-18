package com.alex.draw.persistence.db.model;

import android.util.Log;

public class Triangle extends Shape {

    @Override
    public void draw() {
        Log.d(TAG, "draw: Triangle " + super.toString());
    }
}
