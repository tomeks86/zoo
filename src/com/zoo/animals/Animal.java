package com.zoo.animals;

import com.zoo.infrastructure.Building;

public class Animal {
    private String color;
    private Integer legCount;
    private Float weight;
    private String name = "unnamed animal";
    private Building building;

    public Integer getHungerLevel() {
        return hungerLevel;
    }

    private Integer hungerLevel;// = 50;

    public Animal() {
        hungerLevel = 50;
    }

    public Animal(Integer hungerLevel) {
        this.hungerLevel = hungerLevel;
        //System.out.println("hello from Animal(hungerLevel) constructor");
    }

    public Animal(String name, Integer hungerLevel) {
        this.name = name;
        this.hungerLevel = hungerLevel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getLegCount() {
        return legCount;
    }

    public void setLegCount(Integer legCount) {
        this.legCount = legCount;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move() {
        if (hungerLevel <= 90) {
            hungerLevel += 10;
            System.out.println("I'm an animal - I can move!");
        } else System.out.println("I can't move, please feed me!");
    }

    public void makeSound() {
        if (hungerLevel <= 99) {
            hungerLevel += 1;
            System.out.println("mhmhmmhmm...!");
        } else System.out.println("I can't make a noise..., please feed me!");
    }

    public void eat() {
        System.out.println("I'm an animal, I'm eating!");
        hungerLevel -= 1;
    }

    public void feed() {
        if (hungerLevel > 0) eat();
        else System.out.println("I'm an animal - I'm not hungry!!!");
    }

    @Override
    public String toString() {
        //return super.toString();
        return "I'm an animal and my name is " + name + "!";
    }

    public void setBuilding(Building building) {
        this.building = building;
    }

    public Building getBuilding() {
        return building;
    }
}
