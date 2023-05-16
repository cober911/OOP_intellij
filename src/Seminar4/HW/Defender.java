package Seminar4.HW;
public class Defender extends Warrior {

    public Defender(String name, Sword weapon, int healthPoint, Shield shield) {
        super(name, weapon, healthPoint, shield);
    }

    @Override
    public String toString() {
        return String.format("Defender %s", super.toString());
    }
}
