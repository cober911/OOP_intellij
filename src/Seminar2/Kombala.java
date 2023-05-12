package Seminar2;

public class Kombala extends Herbivores implements Swimible {
    public Kombala(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "I-i-i-i-i";
    }

    @Override
    public int speedSwim() {
        return 90;
    }
}
