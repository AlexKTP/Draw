package com.alex.draw;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.alex.draw.enums.FactoryType;
import com.alex.draw.enums.ShapeType;
import com.alex.draw.persistence.db.Factory.AbstractFactory;
import com.alex.draw.persistence.db.Factory.FactoryCreator;
import com.alex.draw.persistence.db.Factory.ShapeFactory;
import com.alex.draw.persistence.db.model.Shape;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AbstractFactory shapeFactory = FactoryCreator.getFactory(FactoryType.CLASSIC);
        shapeFactory.createShape(ShapeType.CIRCLE);
    }
}