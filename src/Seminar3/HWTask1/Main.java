package Seminar3.HWTask1;

public class Main {
    public static void main(String[] args) {
        NewList newList = new NewList();
        newList.addLast("Example");
        newList.addLast("999");
        newList.addFront("777");
        newList.addLast(12052023);
        newList.addFront(1990);
        for (var item : newList) {
            System.out.println(item);
        }
    }
}
