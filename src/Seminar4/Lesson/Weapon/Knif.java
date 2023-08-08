package Seminar4.Lesson.Weapon;

public class Knif implements Weapon{
    @Override
    public int damage() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Knife damage: %s", damage());
    }
}
