package com.alex.draw.persistence.db.model;

import android.util.Log;

public class Line extends Shape {

    @Override
    public void draw() {
        Log.d(TAG, "draw: Line " + super.toString());
    }


}
