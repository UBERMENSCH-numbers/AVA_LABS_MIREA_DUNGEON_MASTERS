package Pr_7;

import com.sun.jmx.remote.internal.ArrayQueue;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class OutputController {
    static void printMove(int player, ArrayQueue<Integer> plQueue1, ArrayQueue<Integer> plQueue2) {
        if (player == 1) System.out.print("------------Move P1: |" + plQueue1.get(plQueue1.size()-2)+"| vs P2: |" +
                plQueue1.get(plQueue1.size()-1)+ "|");

        if (player == 2) System.out.print("------------Move P1: |" + plQueue2.get(plQueue2.size()-2)+"| vs P2: |" +
                plQueue2.get(plQueue2.size()-1)+ "|");


        if (player == 1) System.out.println("    ***P1 wins***");
        else System.out.println("    ***P2 wins***");

    }

    static void printCards(ArrayQueue<Integer> plQueue1, ArrayQueue<Integer> plQueue2) {
        System.out.println("P1 cards:");
        for (int i : plQueue1) System.out.print(i + "\t");
        System.out.println("\nP2 cards:");
        for (int i : plQueue2) System.out.print(i + "\t");
        System.out.println("");

    }
}
