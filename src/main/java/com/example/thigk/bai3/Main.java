package com.example.thigk.bai3;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Red");
        car.start();
        car.accelerate();
        car.stop();

        Motorcycle motorcycle = new Motorcycle("Honda", "Blue");
        motorcycle.start();
        motorcycle.accelerate();
        motorcycle.stop();

        Truck truck = new Truck("Ford", "White");
        truck.start();
        truck.accelerate();
        truck.stop();
    }
}
