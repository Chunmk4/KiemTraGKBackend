package com.example.thigk.bai1;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, double borderThickness, double radius) {
        super(color, borderThickness);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}


