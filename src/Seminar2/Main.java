package Seminar2;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addList(new Wolf("Wolff"))
                .addList(new Hare("Haree"))
                .addList(new Duck("DonaldDuck"))
                .addList(new Bat("Batman"))
                .addList(new Kombala("Morskaya"))
                .addList(new Osetr("Srednemorskoiy"));
//        for (var item: zoo.walkables()) {
//            System.out.println(item.toString());
//        }
//        for (var item: zoo.flyables()) {
//            System.out.printf("%s - %d", item.toString(), item.speedForFly());

        System.out.println("----------------");
        System.out.println("Winner " + zoo.winnerWalk());
        System.out.println("-----------------");
        System.out.println("Winner " + zoo.winnerFly());
        System.out.println("------------------");
        System.out.println("Winner: " + zoo.winnerSwim());
    }

}

