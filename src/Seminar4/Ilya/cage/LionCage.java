package Seminar4.Ilya.cage;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import Seminar4.Ilya.animals.Lion;
import Seminar4.Ilya.comparators.LionComparator;

public class LionCage implements AnimalCage<Lion> {

    private int clean;
    private ArrayList<Lion> lions;

    public LionCage(ArrayList<Lion> lions) {
        lions = new ArrayList<Lion>();
    }

    public void getAnimal() {
        int randomAnimal = (int) ((Math.random()) * lions.size());
        if (lions.size() == 0) {
            System.out.println("The cage is empty");
        } else {
            lions.get(randomAnimal);
            System.out.println(lions.toString());
        }
    }

    @Override
    public int addAnimal(Lion animal) {
        lions.add((Lion) animal);
        return lions.size();
    }

    @Override
    public int delyverFeed(int weightOfFood) {
        int animalPortion = weightOfFood / lions.size();
        for (Lion lion : lions) {
            if (lion.feed(weightOfFood)) {
                weightOfFood -= animalPortion;
            }
        }
        System.out.println("Remain food: " + weightOfFood);
        return weightOfFood;
    }

    @Override
    public boolean cleanCage() {
        LocalTime now = LocalTime.now();
        if (now.getHour() < 12) {
            return false;
        } else
            return true;
    }

    @Override
    public String toString() {
        return "LionCage(" + "Lions=" + lions + ", clean" + clean + ")";
    }

    public ArrayList<Lion> getLions(){
        return lions;
    }

    public void sortLions() {
        Collections.sort(lions);
    }

    public void SortByManeVolume(){
        Collections.sort(lions, new LionComparator());
    }
}
