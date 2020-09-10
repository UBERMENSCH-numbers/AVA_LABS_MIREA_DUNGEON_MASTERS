package Pr_5;

public class Tests {
    Recursion recursion;

    Tests () {
        recursion = new Recursion();
    }

    public void test10() {
        System.out.println("-----------------------10------------------------");
        System.out.println("input number : 123456");
        System.out.println("reversed number : " + recursion.reverseNum(123456, 0));
    }

    public void test11() {
        System.out.println("-----------------------11------------------------");
        System.out.println("Enter number sequence");
        System.out.println("This sequence contains " + recursion.countOnes() + " ones");
    }
    public void test12() {
        System.out.println("-----------------------12------------------------");
        System.out.println("Enter number sequence");
        System.out.println("Odd numbers :");
        recursion.printOdds();
    }
    public void test13() {
        System.out.println("-----------------------13------------------------");
        System.out.println("Enter number sequence");
        System.out.println("Odd numbers :");
        recursion.printOddNumbers();
    }


}
