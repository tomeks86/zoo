package app.tools;

import com.zoo.animals.Animal;
import com.zoo.animals.Elephant;
import com.zoo.animals.Snake;
import com.zoo.animals.Tiger;
import com.zoo.animals.rare.SiberianTiger;
import com.zoo.animals.rare.WhiteTiger;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {

    public static List<Animal> getAnimals() {
        List<Animal> animals = new ArrayList<>();

        animals.add(new WhiteTiger("Jasio", 72));
        animals.add(new SiberianTiger("Jean", 48));
        animals.add(new Snake("Stefanek", 32));
        animals.add(new Elephant("Jasio", 32));
        animals.add(new Tiger("Henio", 15));
        animals.add(new Snake("Ziutek", 15));

        return animals;
    }
}
