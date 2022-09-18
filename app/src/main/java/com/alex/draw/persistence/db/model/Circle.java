package com.alex.draw.persistence.db.model;

import android.util.Log;

public class Circle extends Shape {

    @Override
    public void draw() {
        Log.d(TAG, "draw: Circle " + super.toString());
    }


}
