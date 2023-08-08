package Seminar4.Ilya.comparators;

import java.util.Comparator;
import Seminar4.Ilya.animals.Animal;

public class AnimalWeightComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        if (o1.getWeight() > o2.getWeight()) {
            return 1;
        } else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        return 0;
    }
}

