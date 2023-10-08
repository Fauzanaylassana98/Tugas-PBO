package com.mycompany.pertemuan6;
/**
* The Circle class models a circle with a radius and color.
*/
public class Circle { // Save as "Circle.java"
    // private instance variable, not accessible from outside this class
    private final double radius;
    private String color;
    
    // Constructors (overloaded)
    public Circle() { // 1st (default) constructor
        radius = 1.0;
        color = "red";
    }
    
    public Circle(double r) { // 2nd constructor
        radius = r;
        color = "red";
    }
    
    public Circle(double r, String c) { // 3rd constructor
        radius = r;
        color = c;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String c) {
        color = c;
    }

    public double getRadius() {
        return radius;  
    }

    public double getArea() {
        return radius*radius*Math.PI;
    }

    public String toString() {
        return "Circle[radius=" + radius + " color=" + color + "]";
    }
}


