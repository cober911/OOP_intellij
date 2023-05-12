package Tutorial;

public class Incapsulaciya_Set_Get {
    public static void main(String[] args) {
        Person pers = new Person();
        pers.setName("Valka");
        pers.setAge(-1);
        pers.speak();
        System.out.println(pers.getNamess() + " " + pers.getAge());

    }
}

class Person {
    private String namess;
    private int age;

    public String getNamess() {
        return namess;
    }

    public int getAge() {
        return age;
    }

    public void setName(String namess) {
        if (namess.isEmpty()) System.out.println("no name");
        else this.namess = namess;
    }

    public void setAge(int age) {
        if (age < 0) System.out.println("no corrected age");
        else this.age = age;
    }


    void speak() {
        String str = String.format("Меня зовут %s, мне %d года", namess, age);
        System.out.println(str);
    }
}
