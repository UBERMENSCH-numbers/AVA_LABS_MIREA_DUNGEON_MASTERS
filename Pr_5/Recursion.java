package Pr_5;

import java.util.Scanner;

public class Recursion {
    /// 10
    public int reverseNum(int number, int revNum) {
        if (number != 0) return reverseNum((int) number / 10, revNum * 10 + number % 10);
        return revNum;
    }

    //11
    public int countOnes() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = 0;
        if (n == 1) n += countOnes();
        else if (n == 0) {
            k = in.nextInt();
            if (k == 0) return n;
            else if (k == 1) k += countOnes();
            else return countOnes();
        } else {
            n =+ countOnes();
        }
        return (n + k);
    }

    public void printOdds() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            if (n % 2 == 1) {
                System.out.println(n);
                printOdds();
            } else {
                printOdds();
            }
        }
    }

    public void printOddNumbers() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n > 0) {
            int m = in.nextInt();
            System.out.println(n);
            if (m > 0) {
                printOddNumbers();
            }
        }
    }

}
