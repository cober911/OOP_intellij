package Ilya_sem1;

public class Drink extends Product {
    protected int volume;

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public Drink(String name, int cost, int volume) {
        super(name, cost);
        this.volume = volume;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), volume);
    }
}
