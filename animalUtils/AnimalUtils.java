package animalUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import animals.Animals;
import animals.Comparators.AnimalAgeComparator;

public class AnimalUtils {
    public static <T extends Animals> void sortByAge(ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }
}
