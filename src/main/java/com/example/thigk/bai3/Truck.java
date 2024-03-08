package com.example.thigk.bai3;

public class Truck extends Vehicle{
    public Truck(String brand, String color) {
        super(brand, color);
    }

    @Override
    public void start() {
        System.out.println("Truck engine starts");
    }

    @Override
    public void accelerate() {
        System.out.println("Truck accelerates");
    }

    @Override
    public void stop() {
        System.out.println("Truck stops");
    }
}
