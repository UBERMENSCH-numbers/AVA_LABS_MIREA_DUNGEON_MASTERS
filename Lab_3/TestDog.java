package Lab_3;

public class TestDog {
    public static void main(String[] args) {
        Dog d = new DogType1();
        System.out.println(d.age);
        System.out.println(d.color);
        System.out.println(d.gender);
        System.out.println(d.hungry);

        d.setAge(10);
        d.setColor("White");
        d.setGender('m');
        d.setHungry(false);

        System.out.println(d.age);
        System.out.println(d.color);
        System.out.println(d.gender);
        System.out.println(d.hungry);

        Dog dog2 = new DogType2(12, 'f', "Black", true);
        System.out.println(dog2.age);
        System.out.println(dog2.color);
        System.out.println(dog2.gender);
        System.out.println(dog2.hungry);


    }
}
