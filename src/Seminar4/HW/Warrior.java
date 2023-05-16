package Seminar4.HW;
import java.util.Random;

public abstract class Warrior<T extends Weapon> {
    private String name;

    protected T weapon;
    private int healthPoint;
    protected T shield;

    public T getWeapon() {
        return weapon;
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public Warrior(String name, T weapon, int healthPoint) {
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
    }
    public Warrior(String name, T weapon, int healthPoint, T shield){
        this.name = name;
        this.weapon = weapon;
        this.healthPoint = healthPoint;
        this.shield = shield;
    }

    @Override
    public String toString() {
        return String.format("Name %s, weapon %s, healthPoint %d, shield %s", name, weapon, healthPoint, shield);
    }

    public int hit() {
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }
    public int block(){
        Random random = new Random();
        if(shield == null)
            return 0;
        else
            return random.nextInt(shield.protection());
    }
}
