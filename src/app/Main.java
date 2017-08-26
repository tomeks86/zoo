package app;

import app.tools.AnimalFactory;
import com.zoo.animals.Animal;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.WhiteTiger;

import java.util.List;

public class Main {
    public static void main(String[] args){

        Tiger myTiger = new WhiteTiger("Stasio", 15);
        myTiger.move();
        Animal mySecondTiger = new Tiger("Stanisław");
        ((WhiteTiger) myTiger).fart();
        System.out.println(myTiger.toString());
        System.out.println(mySecondTiger.toString());

        List<Animal> animalList = AnimalFactory.getAnimals();

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i).getClass().getCanonicalName() + " (zwierze) " + (i + 1) + ": " + animalList.get(i).getName());
        }

        ((WhiteTiger) animalList.get(0)).eat("some shit");
        //Tiger myTiger = new Tiger("Franciszek", 20);
        //Tiger myTiger = new Tiger(80);
        //Tiger myTiger = new Tiger();
        ////System.out.println(myTiger.getHungerLevel());
        ////System.out.println(myTiger.getName());
        ////System.out.println(mySecondTiger.getHungerLevel());
        ////System.out.println(mySecondTiger.getName());
        ////myTiger.move();
        ////System.out.println(myTiger.getHungerLevel());
        ////myTiger.makeSound();
        ////System.out.println(myTiger.getHungerLevel());
        /*myTiger.move();
        myTiger.move();
        myTiger.move();
        myTiger.move();
        myTiger.feed();
        myTiger.move();
        System.out.println(myTiger.getHungerLevel());
        myTiger.makeSound();
        myTiger.feed();
        myTiger.makeSound();
        System.out.println(myTiger.getHungerLevel());
        for (int i = 0; i < 100; i++) {
            myTiger.feed();
        }
        System.out.println(myTiger.getHungerLevel());*/

    }
}
