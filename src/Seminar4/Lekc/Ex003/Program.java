package Seminar4.Lekc.Ex003;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList<>(Arrays.asList(1,2,3,4));
        Integer outt = Methods.getElementFromUCollection(data,3);
        System.out.println(outt);

//        var el = Methods.getElementFromIntegerCollection(data, 1);
//        System.out.println(el);
//        el = Methods.<Integer>getElementFromUCollection(data, 2);
//        el = Methods.getElementFromUCollection(data, 2);
//        System.out.println(el);

    }
}
