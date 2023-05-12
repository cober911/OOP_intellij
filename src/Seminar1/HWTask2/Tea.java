package Seminar1.HWTask2;

public class Tea extends Drink{
    private String color;


    public Tea(String name, int volume, int temperature, int cost, String color) {
        super(name, volume, temperature, cost);
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), color);
    }
}
