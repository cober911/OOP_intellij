package Seminar4.Lesson.Warior;

import Seminar4.Lesson.Weapon.Weapon;

import java.util.Random;

public abstract class Warior {
    private String name;
    private Weapon weapon;
    private int healthPoint;

    public int hit(){
        Random rnd = new Random();
        return rnd.nextInt(weapon.damage());
    }

    public Warior(String name, Weapon weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }

    @Override
    public String toString() {
        return "Warior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                '}';
    }
}
