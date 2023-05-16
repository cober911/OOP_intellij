package Seminar4.HW;
public class Shield implements Weapon{

    @Override
    public int damage() {
        return 0;
    }

    @Override
    public int protection() {
        return 5;
    }

    @Override
    public String toString() {
        return String.format("Shield, max protection: %d", protection());
    }
}
