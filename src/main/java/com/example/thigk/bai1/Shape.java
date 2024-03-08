package com.example.thigk.bai1;

public abstract class Shape {
    protected String color;
    protected double borderThickness;

    public Shape(String color, double borderThickness) {
        this.color = color;
        this.borderThickness = borderThickness;
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                ", borderThickness=" + borderThickness +
                '}';
    }
}

