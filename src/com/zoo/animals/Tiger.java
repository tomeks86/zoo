package com.zoo.animals;

public class Tiger extends Animal {

    public Tiger() {
        super(70);
        //super();
    }

    public Tiger(Integer hungerLevel) {
        super(hungerLevel);
    }

    public Tiger(String name) {
        setName(name);
    }

    public Tiger(String name, Integer hungerLevel) {
        super(hungerLevel);
        setName(name);
        //System.out.println("hello from Tiger(name, hungerLevel) constructor");
    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm a tiger - mooving very fast!");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Awrrr!");
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("Tiger is eating, be warned!");
    }

    //@Override
    //public String toString() {
    //    //return super.toString();
    //    return "I'm an animal and my name is " + super.getName() + "!";
    //}
}
