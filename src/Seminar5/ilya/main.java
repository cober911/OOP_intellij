package Seminar5.ilya;

import java.util.ArrayList;

import Seminar5.ilya.animalUtils.AnimalUtils;
import Seminar5.ilya.animals.Lion;
import Seminar5.ilya.animals.Wolf;
import Seminar5.ilya.factory.LionsFactory;
import Seminar5.ilya.factory.WolfsFactory;

public class Main {

    public static void main(String[] args) {

        ArrayList<Lion> lions = LionsFactory.createLions(10);
        for (Lion lion : lions) {
            System.out.println(lion);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsAge(lions);
        for (Lion lion : lions) {
            System.out.println(lion);
        }

        System.out.println("__________wolfs_____________");

        ArrayList<Wolf> wolfs = WolfsFactory.createWolfs(10);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
        System.out.println("_______________________");
        AnimalUtils.sortAnimalsWeight(wolfs);
        for (Wolf wolf : wolfs) {
            System.out.println(wolf);
        }
    }
}
