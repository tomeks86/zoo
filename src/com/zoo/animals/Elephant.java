package com.zoo.animals;

public class Elephant extends Animal {

    public Elephant(String name, Integer hungerLevel) {
        super(name, hungerLevel);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("DUM DUM DUM! I'm heavy!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Being an elephant I need much food! ;)");
    }
}
