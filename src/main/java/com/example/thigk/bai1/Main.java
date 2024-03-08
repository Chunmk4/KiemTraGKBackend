package com.example.thigk.bai1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("Blue", 2.0, 4.0, 5.0);
        //Diện tích hình chữ nhật
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        //Chu vi hình chữ nhật
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Circle circle = new Circle("Red", 1.5, 3.0);
        //Diện tích hình tròn
        System.out.println("Circle Area: " + circle.calculateArea());
        //Chu vi hình tròn
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());

        Triangle triangle = new Triangle("Green", 1.0, 3.0, 4.0, 5.0);
        //Diện tích hình tam giác
        System.out.println("Triangle Area: " + triangle.calculateArea());
        //Chu vi hình tam giác
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());
    }
}