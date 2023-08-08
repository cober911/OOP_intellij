package Seminar4.Ilya.factory;

import java.util.ArrayList;
import java.util.Random;
import Seminar4.Ilya.animals.Wolf;

public class WolfsFactory {

    public static ArrayList<Wolf> createWolfs (int wolfCount){
        ArrayList<Wolf> wolfInCage = new ArrayList<>(wolfCount);
        for (int i = 0; i < wolfCount; i++) {
            Wolf wolf = new Wolf(new Random().nextInt(30), new Random().nextInt(100), 10, new Random().nextInt(100));
            wolfInCage.add(wolf);
        }
        return wolfInCage;
    }
}
