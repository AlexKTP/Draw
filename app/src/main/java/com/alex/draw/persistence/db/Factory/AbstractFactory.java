package com.alex.draw.persistence.db.Factory;

import com.alex.draw.enums.ShapeType;
import com.alex.draw.persistence.db.model.Shape;

public abstract class AbstractFactory {
    public abstract Shape createShape(ShapeType shapeType);
}
