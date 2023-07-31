package Tutorial.Zoo;

import java.util.ArrayList;

public class Lion extends Animal {
    public Lion() {
    }

    public Lion(float height, float weight, Colors color, int number) {
        super(height, weight, color, number);
    }

    @Override
    public void makeSound() {
        System.out.println("G-r-r-r-r");;
    }
}
