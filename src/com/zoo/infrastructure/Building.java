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
        animal.setBuilding(this);
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

    public ArrayList<String> getanimalNames() {
        ArrayList<String> animalNames = new ArrayList<>();
        for (Animal animal : animals) {
            animalNames.add(animal.getName());
        }
        return animalNames;
    }

    public Integer getAnimalIndex(String name) {
        ArrayList<String> names = this.getanimalNames();
        Integer animalIndex = names.indexOf(name);
        System.out.println(animals.get(0).getName());
        if (animalIndex > -1) {
            System.out.println("animal " + name + " found in cage " + (animalIndex + 1) + "!");
        } else {
            System.out.println("animal " + name + " was not found in this (" + this.getName() + ") building!");
        }
        return animalIndex;
    }

    public Animal getAnimalByName(String name) {
        Animal result = null;
        for (Animal animal : animals) {
            if (animal.getName().equals(name)) {
                result = animal;
                break;
            }
        }
        return result;
    }
}
