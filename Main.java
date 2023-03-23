import animals.Lion;
import cage.LionCage;
import factory.LionsFactory;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Lion> lions = LionsFactory.createLions(10);

        LionCage lionInCage = new LionCage();

        System.out.println(lionInCage);
        lionInCage.sortByManeVolume();
        System.out.println(lionInCage);

    }

//    Lion lion1 = new Lion(5,52,4,42);
//    Lion lion2 = new Lion(4,32,4,52);
//    Lion lion3 = new Lion(3,45,4,62);
//
//    // LionCage lionCage = new LionCage();
//    LionCage.addAnimal(lion1);
//    LionCage.addAnimal(lion2);
//    LionCage.addAnimal(lion3);


}
