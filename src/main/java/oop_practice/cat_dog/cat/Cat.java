package oop_practice.cat_dog.cat;

import oop_practice.cat_dog.animal.Animal;

public class Cat extends Animal {
    public Cat(String nameOfCat) {
    }

    @Override
    public void sound() {
        System.out.println("I'am a Cat. My name Vasya. Mew");
    }
}
