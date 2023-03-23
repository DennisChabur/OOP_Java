package cage;

import java.util.ArrayList;
import java.util.Collections;

import animals.*;
import animals.Comparators.LionComparator;
import cage.AnimalCage;

public class LionCage implements AnimalCage<Lion> {

    private int clean;
    private ArrayList<Lion> lions;

    public LionCage() {
        this.lions = lions;
    }

    @Override
    public int addAnimal(Lion) {
        lions.add(Lion lions);
        return lions.size();
    }

    @Override
    public void ReturnAnimal() {
        int randAnimal = (int) ((Math.random() * (lions.size())));
        if (lions.size() == 0)
            System.out.println("Cage is empty");
        else {
            System.out.println("Random lion from cage");
            lions.get(randAnimal).printLion();
        }
    }

    public ArrayList<Lion> getLions() {
        return lions;
    }

    @Override
    public int giveFood(int foodWeight) {

        return 0;
    }

    @Override
    public int cleanGage() {
        clean = foodWeight -
        if()
        return 0;
    }

    @Override
    public String toString() {
        return "LionCage{" + "lions=" + lions + ", clean=" + clean + '}';
    }

    public void sortLions(ArrayList<Lion> lions) {
        Collections.sort(lions);
    }

    public void sortByManeVolume() {
        Collections.sort(lions, new LionComparator());
    }
}
