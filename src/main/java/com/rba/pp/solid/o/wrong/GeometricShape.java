package com.rba.pp.solid.o.wrong;

public class GeometricShape  {

    private double width;
    private double height;

    // Wrong because Square haven't a radius
    private double radius;

    // Waste processing by selecting a shape
    Double calculateArea(ShapeType shape){
        if(shape.equals(ShapeType.SQUARE)){
            return squareArea();
        }
        else if(shape.equals(ShapeType.CIRCLE)){
            return circleArea();
        } else {
            return null;
        }
    }

    double squareArea(){
        return width * height;
    }

    double circleArea(){
        return Math.PI * radius * radius;
    }


}
