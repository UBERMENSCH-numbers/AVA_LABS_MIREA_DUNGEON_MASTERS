package Lab_3;

public class DogType1 extends Dog {

    public DogType1(int age, char gender, String color, boolean hungry) {
        super(age, gender, color, hungry);
    }

    public DogType1() {
    }

    @Override
    void bark() {
        System.out.println("bark1");
    }

    @Override
    void sleep() {
        System.out.println("sleep1");
    }

    @Override
    void eat() {
        System.out.println("eat1");
        hungry = false;
    }


}
