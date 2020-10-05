package Pr_12.task2;


public class TestAddress {

    public static void main(String[] args) {
        Address ad1 = Address.fromString("Страна, Регион, Город, Улица, Дом, Корпус, Квартира");
        Address ad2 = Address.fromAnotherString("Страна; Регион; Город; Улица; Дом; Корпус; Квартира");

        System.out.println(ad1);
        System.out.println(ad2);
    }
}
