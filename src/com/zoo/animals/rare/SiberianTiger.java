package com.zoo.animals.rare;

import com.zoo.animals.Tiger;

public class SiberianTiger extends Tiger {

    public SiberianTiger(String name, Integer hungerLevel) {
        super(name, hungerLevel);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("I'm a wrrr white tiger!");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm a SIBERIAN tiger and I double the speed!");
    }

    public void fart() {
        System.out.println("pryk!, ups");
    }

    @Override
    public String toString() {
        //return super.toString();
        return "I'm an animal and my name is " + super.getName() + "!";
    }
}
