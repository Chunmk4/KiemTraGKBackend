package com.example.thigk.bai3;

public abstract class Vehicle {
    protected String brand;
    protected String color;

    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public abstract void start();

    public abstract void accelerate();

    public abstract void stop();

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
