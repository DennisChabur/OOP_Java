package cage;
import animals.*;
import animals.Comparators.AnimalAgeComparator;

import java.util.ArrayList;
import java.util.Collections;

public interface AnimalCage<T extends Animals> {
    
    int addAnimal(T t);

    boolean giveFood(int foodWeight);

    int cleanCage(boolean clean);

    T takeOfAnimal();

    int countAnimals();

    default void sortByAge(ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }
}
