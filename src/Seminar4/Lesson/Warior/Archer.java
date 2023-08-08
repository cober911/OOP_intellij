package Seminar4.Lesson.Warior;

import Seminar4.Lesson.Weapon.Bow;
import Seminar4.Lesson.Weapon.Weapon;

import java.util.Random;

public class Archer extends Warior<Bow> {
    public Archer(String name, Bow bow, int healthPoint) {
        super(name, bow, healthPoint);
    }
    int range(){
        Random rnd = new Random();
        return rnd.nextInt(weapon.range());

    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
