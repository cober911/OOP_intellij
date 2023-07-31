package Tutorial.Generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            intList.add(i);
        }
        System.out.println(intList.size());
        for (Integer value : intList) {
            if (value % 15 == 0) System.out.print(" " + value);
        }
    }
}
