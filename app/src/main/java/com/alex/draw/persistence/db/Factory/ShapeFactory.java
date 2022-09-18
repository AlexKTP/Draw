package com.alex.draw.persistence.db.Factory;

import com.alex.draw.enums.ShapeType;
import com.alex.draw.persistence.db.model.Circle;
import com.alex.draw.persistence.db.model.IShape;
import com.alex.draw.persistence.db.model.Line;
import com.alex.draw.persistence.db.model.Rectangle;
import com.alex.draw.persistence.db.model.Square;
import com.alex.draw.persistence.db.model.Triangle;

import java.util.Objects;

public class ShapeFactory extends AbstractFactory {


    @Override
    IShape getShape(ShapeType shapeType) {
        if(Objects.equals(shapeType, ShapeType.LINE)){
            return new Line();
        } else if (Objects.equals(shapeType, ShapeType.CIRCLE)){
            return new Circle();
        } else if (Objects.equals(shapeType, ShapeType.RECTANGLE)){
            return new Rectangle();
        } else if (Objects.equals(shapeType, ShapeType.SQUARE)){
            return new Square();
        } else if (Objects.equals(shapeType, ShapeType.TRIANGLE)){
            return new Triangle();
        } else {
            return null;
        }
    }
}
