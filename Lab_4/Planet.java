package Lab_4;

public class Planet implements Nameable{
    private String name = "None";

    public Planet(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }
}
