package com.example.thigk.bai3;

public class Car extends Vehicle{
    public Car(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        //Động cơ ô tô khởi động
        System.out.println("Car engine starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Car accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Car stops");
    }
}
