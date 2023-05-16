package Seminar4.HW;
public class Sword implements Weapon{

    @Override
    public int damage() {
        return 20;
    }

    @Override
    public int protection() {
        return 0;
    }

    @Override
    public String toString() {
        return String.format("Sword, max damage: %d", damage());
    }
}
