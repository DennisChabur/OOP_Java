package animals.Comparators;

import animals.Animals;

import java.util.Comparator;

public class AnimalAgeComparator implements Comparator<Animals> {
    @Override
    public int compare(Animals age1, Animals age2) {
        if (age1.getAge() < age2.getAge()) {
            return 1;
        } else if (age1.getAge() > age2.getAge()) {
            return -1;
        }
        return 0;
    }
}
