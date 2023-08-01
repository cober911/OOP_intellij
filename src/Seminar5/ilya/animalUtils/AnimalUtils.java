package Seminar5.ilya.animalUtils;

import java.util.Collections;
import java.util.List;
import Seminar5.ilya.animals.Animal;
import Seminar5.ilya.comparators.AnimalAgeComparator;
import Seminar5.ilya.comparators.AnimalWeightComparator;

public class AnimalUtils {
    public static <T extends Animal> List<T> sortAnimalsAge(List<T> animalList) {
        Collections.sort(animalList, new AnimalAgeComparator());
        return animalList;
    }

    public static <T extends Animal> List<T> sortAnimalsWeight(List<T> animalList) {
        Collections.sort(animalList, new AnimalWeightComparator());
        return animalList;
    }
}
