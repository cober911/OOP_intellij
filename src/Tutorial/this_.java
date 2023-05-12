package Tutorial;

public class this_ {
    public static void main(String[] args) {
        Human hum = new Human();
        hum.setName("Vova");
        hum.setAge(12);
        hum.outout();

    }

}

class Human {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void outout() {
        System.out.printf("%s, %d", name, age);
    }
}
