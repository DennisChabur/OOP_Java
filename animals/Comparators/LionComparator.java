package animals.Comparators;

import java.util.Comparator;

import animals.Lion;

public class LionComparator implements Comparator<Lion> {
    @Override
    public int compare(Lion lion1, Lion lion2){
        if(lion1.getManeVolume() > lion2.getManeVolume()) return 1;
        else if (lion1.getManeVolume() < lion2.getManeVolume()) return -1;
        return 0;
    }
}
