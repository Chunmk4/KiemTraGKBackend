package com.example.thigk.bai1;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, double borderThickness, double width, double height) {
        super(color, borderThickness);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (width + height);
    }
}

