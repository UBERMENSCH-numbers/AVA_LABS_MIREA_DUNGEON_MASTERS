package Lab_3;

public class DogType2 extends Dog {

    public DogType2(int age, char gender, String color, boolean hungry) {
        super(age, gender, color, hungry);
    }

    public DogType2() {
    }

    @Override
    void bark() {
        System.out.println("bark2");
    }

    @Override
    void sleep() {
        System.out.println("sleep2");
    }

    @Override
    void eat() {
        System.out.println("eat2");
        hungry = false;
    }
}
