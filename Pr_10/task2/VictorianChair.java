package Pr_10.task2;


import Pr_10.task2.interfaces.Chair;

public class VictorianChair implements Chair {

    private final int age;


    public VictorianChair(int age) {
        this.age = age;
    }


    public int getAge() {
        return age;
    }
}
