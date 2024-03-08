package com.example.thigk.bai2;

public class Bird extends Animal{
    public Bird(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird chirps");
    }

    @Override
    public void move() {
        System.out.println("Bird fly");
    }
}
