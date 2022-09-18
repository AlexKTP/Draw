package com.alex.draw.persistence.db.Factory;

import com.alex.draw.enums.ShapeType;
import com.alex.draw.persistence.db.model.IShape;

public abstract class AbstractFactory {
    abstract IShape createShape(ShapeType shapeType);
}
