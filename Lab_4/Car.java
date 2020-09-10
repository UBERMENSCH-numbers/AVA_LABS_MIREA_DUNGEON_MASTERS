package Lab_4;

public class Car implements Nameable{
    private String name = "None";

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
