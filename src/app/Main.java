package app;

import com.zoo.animals.Animal;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.WhiteTiger;

public class Main {
    public static void main(String[] args){

        Tiger myTiger = new WhiteTiger("Stasio", 15);
        myTiger.move();
        Animal mySecondTiger = new Tiger("Stanisław");
        ((WhiteTiger) myTiger).fart();
        System.out.println(myTiger.toString());
        System.out.println(mySecondTiger.toString());
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
