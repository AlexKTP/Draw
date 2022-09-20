package com.alex.draw.persistence.db.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;

import com.alex.draw.enums.FactoryType;
import com.alex.draw.enums.ShapeType;
import com.alex.draw.persistence.db.Factory.AbstractFactory;
import com.alex.draw.persistence.db.Factory.FactoryCreator;
import com.alex.draw.persistence.db.Factory.ShapeFactory;

import java.util.Objects;

public class DrawingView extends View {

    private Bitmap bitmap;
    private Canvas canvas;
    private Path path;
    private Paint bitmapPaint;
    private Paint circlePaint;
    private Path circlePath;
    private Paint paint;


    public DrawingView(Context c) {
        super(c);
        /*paint = new Paint();
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setColor(Color.GREEN);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(12);
        path = new Path();
        bitmapPaint = new Paint(Paint.DITHER_FLAG);
        circlePaint = new Paint();
        circlePath = new Path();
        circlePaint.setAntiAlias(true);
        circlePaint.setColor(Color.BLUE);
        circlePaint.setStyle(Paint.Style.STROKE);
        circlePaint.setStrokeJoin(Paint.Join.MITER);
        circlePaint.setStrokeWidth(4f);*/
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        /*bitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);
        canvas = new Canvas(bitmap);*/
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*canvas.drawBitmap(bitmap, 0, 0, bitmapPaint);
        canvas.drawPath(path, paint);
        canvas.drawPath( circlePath,  circlePaint);*/
    }

    public void addShape(ShapeType shapeType){
     /*   if(Objects.equals(shapeType, ShapeType.TRIANGLE) ||
        Objects.equals(shapeType, ShapeType.RECTANGLE) ||
        Objects.equals(shapeType, ShapeType.SQUARE) ||
        Objects.equals(shapeType, ShapeType.CIRCLE) ||
        Objects.equals(shapeType, ShapeType.LINE)){
            AbstractFactory shapeFactory = FactoryCreator.getFactory(FactoryType.CLASSIC);
            shapeFactory.createShape(shapeType);
        }*/
    }


}
