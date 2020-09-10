package Lab_3;

public abstract class Dog {
    protected int age = 0;
    protected char gender = '0';
    protected String color = "None";
    protected boolean hungry = true;

    public Dog(int age, char gender, String color, boolean hungry) {
        this.age = age;
        this.gender = gender;
        this.color = color;
        this.hungry = hungry;
    }

    public Dog() {
    }

    abstract void bark();
    abstract void sleep();

    void eat() {
        System.out.println("eat");
        hungry = false;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
}
