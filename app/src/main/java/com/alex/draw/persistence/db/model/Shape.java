package com.alex.draw.persistence.db.model;


public abstract class Shape implements IShape {

    public static final String TAG = "DRAWING_SHAPE";

    private int color;
    private int transparency;
    private int size;

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public int getTransparency() {
        return transparency;
    }

    public void setTransparency(int transparency) {
        this.transparency = transparency;
    }

    public int getSize() { return size; }

    public void setSize(int size) { this.size = size; }

    @Override
    public String toString() {
        return "Shape{" +
                "color=" + color +
                ", transparency=" + transparency +
                ", size=" + size +
                '}';
    }

}
