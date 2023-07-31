package Tutorial.Zoo;

import java.util.ArrayList;

public class Swan extends Animal{
    public Swan() {
    }

    public Swan(float height, float weight, Colors color, int number) {
        super(height, weight, color, number);
    }

    @Override
    public void makeSound() {
        System.out.println("ssssssssssss!!!");
    }
}
