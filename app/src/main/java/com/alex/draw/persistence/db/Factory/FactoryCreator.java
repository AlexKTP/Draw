package com.alex.draw.persistence.db.Factory;

import com.alex.draw.enums.FactoryType;

import java.util.Objects;

public class FactoryCreator {
    public static AbstractFactory getFactory(FactoryType factoryType){
        if(Objects.equals(factoryType, FactoryType.CLASSIC)){
            return new ShapeFactory();
        }else{
            return null;
        }
    }
}
