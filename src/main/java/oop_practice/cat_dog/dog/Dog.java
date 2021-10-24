package oop_practice.cat_dog.dog;

import oop_practice.cat_dog.animal.Animal;

public class Dog extends Animal {
    public Dog(String nameOfDog) {
    }

    @Override
    public void sound() {
        System.out.println("I'am a Doc. My name is Tuzik. Gav");
    }
}
