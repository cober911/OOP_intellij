package Seminar4.Ilya;

import java.util.ArrayList;

import Seminar4.Ilya.animalUtils.AnimalUtils;
import Seminar4.Ilya.animals.Lion;
import Seminar4.Ilya.animals.Wolf;
import Seminar4.Ilya.factory.LionsFactory;
import Seminar4.Ilya.factory.WolfsFactory;

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
