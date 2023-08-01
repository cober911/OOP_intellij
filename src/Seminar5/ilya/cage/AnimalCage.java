package Seminar5.ilya.cage;

import java.util.ArrayList;
import java.util.Collections;
import Seminar5.ilya.animals.Animal;
import Seminar5.ilya.comparators.AnimalAgeComparator;
import Seminar5.ilya.comparators.AnimalWeightComparator;

public interface AnimalCage<T extends Animal> {

    int addAnimal(T animal);

    int delyverFeed(int weightOfFood);

    boolean cleanCage();

    void getAnimal();

    default void sortByAge (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalAgeComparator());
    }

    default void sortByWeight (ArrayList<T> animalList){
        Collections.sort(animalList, new AnimalWeightComparator());
    }
}
