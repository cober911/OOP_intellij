package Seminar4.Ilya.animalUtils;

import java.util.Collections;
import java.util.List;
import Seminar4.Ilya.animals.Animal;
import Seminar4.Ilya.comparators.AnimalAgeComparator;
import Seminar4.Ilya.comparators.AnimalWeightComparator;

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
