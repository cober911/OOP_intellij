package Seminar4.Ilya.cage;

import java.util.ArrayList;
import java.util.Collections;
import Seminar4.Ilya.animals.Animal;
import Seminar4.Ilya.comparators.AnimalAgeComparator;
import Seminar4.Ilya.comparators.AnimalWeightComparator;

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
