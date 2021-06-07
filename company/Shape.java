package com.company;

import java.text.DecimalFormat;

public class Shape {
    private String type;
    private int size;

    public double area(){
        System.out.println("Shape not specified cannot provide area");
        return -1;
    }

    public double perimeter(){
        System.out.println("Shape not specified cannot provide area");
        return -1;
    }

    public String getType(){
        return type;
    }

    public int getSize(){
        return size;
    }

    public void setType(String newType){
        type = newType;
    }

    public void setSize(int newSize){
        size = newSize;
    }

    public void print(){
        double area = this.area();
        double perimeter = this.perimeter();
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.print(type + " of size " + size + " has area " + (df.format(area)));
        System.out.println(", perimeter " + (df.format(perimeter)));
    }
}
