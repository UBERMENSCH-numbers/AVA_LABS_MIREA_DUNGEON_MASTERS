package Pr_10.task2;


import Pr_10.task2.FunctionalChair;
import Pr_10.task2.VictorianChair;
import Pr_10.task2.interfaces.Chair;

public class Person {

    private Chair chair;

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }


    public void sit(Chair chair) {
        System.out.println("Sit");
    }

    public void sit() {
        System.out.println("Sit on " + chair.toString());
    }
}
