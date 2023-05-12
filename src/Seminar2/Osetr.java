package Seminar2;

public class Osetr extends Predator implements Swimible{

    public Osetr(String name){
        super(name);
    }
    @Override
    public String say() {
        return "Arr-rrr-rrr";
    }

    @Override
    public int speedSwim() {
        return 130;
    }
}