package com.example.thigk.bai1;

public class Triangle extends Shape{
    private double edge1;
    private double edge2;
    private double edge3;

    public Triangle(String color, double borderThickness, double edge1, double edge2, double edge3) {
        super(color, borderThickness);
        this.edge1 = edge1;
        this.edge2 = edge2;
        this.edge3 = edge3;
    }

    @Override
    public double calculateArea() {
        double s = (edge1 + edge2 + edge3) / 2;
        return Math.sqrt(s * (s - edge1) * (s - edge2) * (s - edge3));
    }

    @Override
    public double calculatePerimeter() {
        return edge1 + edge2 + edge3;
    }
}
