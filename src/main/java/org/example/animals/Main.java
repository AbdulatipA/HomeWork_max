package org.example.animals;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Собака");
        Bird bird = new Bird("Птица");

        dog.Move();
        bird.Move();

        Animals[] animals = {dog, bird};
        for (Animals animal : animals) {
            System.out.println(animal);
        }
    }
}
