package com.zoo.animals;

public class Snake extends Animal {

    public Snake(String name, Integer hungerLevel) {
        super(name, hungerLevel);
    }

    public Snake(Integer hungerLevel) {
        super(hungerLevel);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("Ssssssss, najjjjssssss!");
    }
}
