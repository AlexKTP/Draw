package com.alex.draw.persistence.db.model;

import android.util.Log;

public class Rectangle extends Shape {

    @Override
    public void draw() {
        Log.d(TAG, "draw: Rectangle " + super.toString());
    }
}
