package factory;

import java.util.ArrayList;
import java.util.Random;

import animals.*;

public class LionsFactory {
    public static void main(String [] args){
        ArrayList<Lion> lions = new ArrayList<Lion>();
    }

    static public ArrayList<Lion> createLions(int lionCount){
        ArrayList<Lion> lionInCage = new ArrayList<>(lionCount);
        for (int i = 0; i < lionCount; i++) {
            Lion lion = new Lion(new Random().nextInt(10), new Random().nextInt(50) + 50, 4, new Random().nextInt(50));
            lionInCage.add(lion);
        }
        return lionInCage;
    }
}
