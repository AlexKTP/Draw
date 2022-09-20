package com.alex.draw;

import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.alex.draw.persistence.db.model.DrawingView;

public class MainActivity extends AppCompatActivity {

    private DrawingView dv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // dv = new DrawingView(this);
      //  setContentView(dv);
    }


}