package com.example.thigk.bai3;

public class Motorcycle extends Vehicle{
    public Motorcycle(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Motorcycle engine starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Motorcycle accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Motorcycle stops");
    }
}
