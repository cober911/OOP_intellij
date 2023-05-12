package Seminar1;

public class Milk extends Product{
    private int percent;

    public Milk(String name, int cost, int percent){
        super(name, cost);
        this.percent = percent;
    }

    @Override
    public String toString() {
        return String.format("%s, %d", super.toString(), percent);
    }
}
