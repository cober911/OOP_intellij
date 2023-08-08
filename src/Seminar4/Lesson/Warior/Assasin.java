package Seminar4.Lesson.Warior;

import Seminar4.Lesson.Weapon.Knif;
import Seminar4.Lesson.Weapon.Weapon;

public class Assasin extends Warior<Knif>{

    public Assasin(String name, Knif knif, int healthPoint) {
        super(name, knif, healthPoint);
    }

    @Override
    public String toString() {
        return String.format("Assasin %s", super.toString());
    }
}
