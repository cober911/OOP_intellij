package Seminar2;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String feed();

    public abstract String say();
    @Override
    public String toString() {
        return String.format("Name:  %s; say %s; feed %s", name, say(), feed());
    }
}
