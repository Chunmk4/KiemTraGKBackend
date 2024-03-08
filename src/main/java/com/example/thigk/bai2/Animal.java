package com.example.thigk.bai2;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
//Tiếng kêu
    public abstract void makeSound();
//Di chuyển
    public abstract void move();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
