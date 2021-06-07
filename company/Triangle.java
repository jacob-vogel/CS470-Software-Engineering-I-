package com.company;

public class Triangle extends Shape{
    @Override
    public double area(){
        double height = ((Math.sqrt(3) / 2) * getSize());
        return (0.5 * (getSize() * height));
    }

    @Override
    public double perimeter(){
        return (3 * getSize());
    }
}
