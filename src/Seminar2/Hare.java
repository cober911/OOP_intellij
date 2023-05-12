package Seminar2;

public class Hare extends Herbivores{

    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pipipipi";
    }
}
