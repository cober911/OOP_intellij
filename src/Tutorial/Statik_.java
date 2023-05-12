package Tutorial;

public class Statik_ {
    public static void main(String[] args) {
        Human2.description = "nice";
        Human2.getDescription();
        Human2 hum2 = new Human2("bob", 22);

    }
}

class Human2 {
    private String name;
    private int age;
    public static String description;

    public Human2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setHuman1(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public static void  getDescription(){
        System.out.println(description);
    }
}
