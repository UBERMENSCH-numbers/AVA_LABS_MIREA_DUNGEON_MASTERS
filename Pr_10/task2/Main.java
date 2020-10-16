package Pr_10.task2;

import Pr_10.task1.ConcreteFactory;
import Pr_10.task2.ChairFactory;
import Pr_10.task2.Person;
import Pr_10.task2.interfaces.Chair;

public class Main {

    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();
        Person person = new Person();
        person.setChair(chairFactory.createMagicChair());
        person.sit();
    }
}
