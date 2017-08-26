package com.zoo.infrastructure;

import com.zoo.animals.Animal;

import java.util.ArrayList;

public class Building {

    private ArrayList<Animal> animals;

    private String name;

    public Building(String name) {
        this.name = name;
        animals = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
        System.out.println("Animal added to building: " + name);
    }

    public Integer getAnimalCount() {
        return animals.size();
    }

    public String getAnimalTypes() {
        String result = "";
        for (Animal animal : animals) {
            result = result + animal.getClass().getCanonicalName() + "\n";
        }
        return result;
    }
}
