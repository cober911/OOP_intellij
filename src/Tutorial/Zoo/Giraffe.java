package Tutorial.Zoo;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Giraffe extends Animal{
    public Giraffe() {
    }

    public Giraffe(float height, float weight, Colors color, int number) {
        super(height, weight, color, number);
    }

    @Override
    public void makeSound() {
        System.out.println("pheeeeew pheeew");
    }
}


