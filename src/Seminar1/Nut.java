package Seminar1;

public class Nut extends Product{
    private String type_;



    public Nut(String name, Integer cost, String type_){
        super(name, cost);
        this.type_ = type_;
    }
    @Override
    public String toString() {
        return String.format("%s, %s", super.toString(), type_);
    }
}
