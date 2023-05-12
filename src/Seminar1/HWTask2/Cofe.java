package Seminar1.HWTask2;

public class Cofe extends Drink{

    String type;


    public Cofe(String name, int volume, int temperature, int cost, String type) {
        super(name, volume, temperature, cost);
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), type);
    }
}
