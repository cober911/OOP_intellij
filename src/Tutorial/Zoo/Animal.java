package Tutorial.Zoo;

import java.util.ArrayList;

public class Animal {
    protected float height;
    protected float weight;
    protected Colors color;
    protected int number;

    public Animal() {

    }

    public Animal(float height, float weight, Colors color, int name) {
        this.height = height;
        this.weight = weight;
        this.color = color;
        this.number = name;
    }

    public enum Colors {YELLOW, DARK, RED, BLACK, WHITE}

    private ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public Colors getColor() {
        return color;
    }

    public void setColor(Colors color) {
        this.color = color;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public int getNumber() {
        return number;
    }

    public void makeSound() {
        System.out.println("...");
    }

    public void move() {

    }

    public void replication() {
        this.number = 1;
        for (var i = 0; i < 5; i++) {
            addAnimal(new Lion(5.5f, 100, Colors.DARK, this.number));
            this.number++;
            addAnimal(new Giraffe(5.5f, 150, Colors.RED, this.number));
            this.number++;
            addAnimal(new Swan(5.5f, 200, Colors.YELLOW, this.number));
            this.number++;

        }
    }

    public void spisokAnimals() {
        for (var element : animals) {
            System.out.println(element);
        }
    }

    public void feed() {
        for (var element : animals) {
            double value = Math.random() * 200;
            if (element.weight + value <= 350) {
                element.weight += (float) value;
            } else System.out.println(element.number + "Cтолько нельзя!");
        }
    }

    @Override
    public String toString() {
        return String.format("Высота: %.2f Вес: %.2f Цвет: %s Номер: %s", height, weight, color, number);
    }
}
