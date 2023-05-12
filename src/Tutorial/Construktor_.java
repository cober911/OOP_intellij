package Tutorial;

public class Construktor_ {
    public static void main(String[] args) {
        Human1 hums = new Human1();
        hums.setHuman2();


    }
}

class Human1 {
    private String name;
    private int age;
    private int rost;

    Human1() {
        this.name = "default";
        this.age = 40;
        this.rost = 180;
    }

    public void setHuman1(String name, int age, int rost) {
        this.name = name;
        this.age = age;
        this.rost = rost;
    }
    void setHuman2(){
        System.out.println(name + age + rost);
    }

}


