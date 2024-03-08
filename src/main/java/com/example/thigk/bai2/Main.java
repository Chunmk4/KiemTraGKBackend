package com.example.thigk.bai2;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Husky", 3);
        dog.makeSound();
        dog.move();

        Cat cat = new Cat("Munchkin", 5);
        cat.makeSound();
        cat.move();

        Bird bird = new Bird("Tweetie", 2);
        bird.makeSound();
        bird.move();
    }
}
