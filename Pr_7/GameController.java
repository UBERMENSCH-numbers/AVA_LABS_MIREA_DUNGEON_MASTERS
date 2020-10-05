package Pr_7;



import com.sun.jmx.remote.internal.ArrayQueue;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.abs;
import static java.lang.Math.min;

public class GameController {
    int move = 0;
    ArrayQueue<Integer> plQueue1;
    ArrayQueue<Integer> plQueue2;
    boolean gameOver = false;

    GameController() {
        plQueue1 = new ArrayQueue<>(10);
        plQueue2 = new ArrayQueue<>(10);
    }

    void prepareGame() {
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) list.add(i);
//        java.util.Collections.shuffle(list);
//        for (int i = 0; i < 10;){
//            plQueue1.add(list.get(i));
//            i++;
//            plQueue2.add(list.get(i));
//            i++;
//        }
        plQueue1.add(0);
        plQueue1.add(1);
        plQueue1.add(2);
        plQueue1.add(3);
        plQueue1.add(4);
        plQueue2.add(5);
        plQueue2.add(6);
        plQueue2.add(7);
        plQueue2.add(8);
        plQueue2.add(9);

        System.out.println("Player cards :");
        OutputController.printCards(plQueue1, plQueue2);
    }

    void startGame() {
        while (!gameOver) {
            if (move == 106) {
                System.out.println("botva");
                break;
            }
            int i = move();
            OutputController.printMove(i, plQueue1, plQueue2);
            OutputController.printCards(plQueue1, plQueue2);
            if (plQueue2.size() == 0 || plQueue1.size() == 0) gameOver = true;
        }
        System.out.println("----------------GAME OVER--------------------");
        if (plQueue2.isEmpty()) System.out.println("first " + move);
        if (plQueue1.isEmpty()) System.out.println("second " + move);
    }

    int move () {
        move ++;
        int p1 = plQueue1.remove(0);
        int p2 = plQueue2.remove(0);
        if (abs(p1 - p2) == 9) {
            if (p1 == 0) {
                plQueue1.add(p1);
                plQueue1.add(p2);
                return 1;
            } else {
                plQueue2.add(p1);
                plQueue2.add(p2);
                return 2;
            }
        } else {
            if (p1 > p2) {
                plQueue1.add(p1);
                plQueue1.add(p2);
                return 1;
            } else {
                plQueue2.add(p1);
                plQueue2.add(p2);
                return 2;
            }
        }
    }
}
