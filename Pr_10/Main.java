package Pr_10;

import Pr_10.task1.ConcreteFactory;
import Pr_10.task2.ChairFactory;

public class Main {

    public static void main(String[] args) {
        ConcreteFactory concreteFactory = new ConcreteFactory();
        System.out.println(concreteFactory.createComplex());
    }
}
