package Seminar5.ilya.comparators;

import java.util.Comparator;
import Seminar5.ilya.animals.Snake;

public class SnakeComparator implements Comparator<Snake>{
    @Override
    public int compare(Snake o1, Snake o2) {
        if (o1.getBodyLenght() > o2.getBodyLenght()) {
            return 1;
        } else if (o1.getBodyLenght() < o2.getBodyLenght()) {
            return -1;
        }
        return 0;
    }
}
