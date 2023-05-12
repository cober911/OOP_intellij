package Seminar1.HWTask2;

public class Drink {
    private String name;
    private int volume;
    private  int temperature;
    private  int cost;

    public Drink(String name, int volume, int temperature, int cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public int getTemperature() {
        return temperature;
    }

    public int getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return String.format("%s, %s, %s, %s", name, volume, temperature, cost);
    }
}
