package Pr_9;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);

        System.out.println("Введите ИНН: ");
        String inputInn = input.nextLine();

        try {
            shop.checkout(inputInn);
        } catch (InvalidInnException e) {
            System.out.println("Некорректный ИНН.");
        }
    }
}
