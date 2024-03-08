package com.example.thigk.bai2;

public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    @Override
    public void move() {
        System.out.println("Dog walks");
    }
}
