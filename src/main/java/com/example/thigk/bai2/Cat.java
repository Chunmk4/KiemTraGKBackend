package com.example.thigk.bai2;

public class Cat extends Animal{
    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat meows");
    }

    @Override
    public void move() {
        System.out.println("Cat walks");
    }
}
