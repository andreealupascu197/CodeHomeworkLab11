package ro.fasttrackit.code.ex1;

public class Flower {

    private final String name;

    public Flower(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                '}';
    }
}
