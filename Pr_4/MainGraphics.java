package Pr_4;

import java.awt.*;
import javax.swing.*;

public class MainGraphics extends JFrame {
    static JButton but1 = new JButton("AC Milan");
    static JButton but2 = new JButton("Real Madrid");
    static JLabel lbl1 = new JLabel("Result: 0 X 0");
    static JLabel lbl2 = new JLabel("Last Scorer: N/A");
    static Label lbl = new Label("Winner: DRAW");
    Controller controller;

    MainGraphics() {
        super("Example");
        controller = new Controller();
        setLayout(new FlowLayout());
        setSize(250,300);
        add(but1);
        add(but2);
        add(lbl);
        add(lbl1);
        add(lbl2);
        but1.addActionListener(e -> {
            controller.milanScores();
        }) ;
        but2.addActionListener(e ->{
            controller.realScores();
        });
        setVisible(true);
    }


    public static void refresh(int milan, int real, String lastScorer) {
        lbl1.setText("Result: " + milan + " X " + real);
        lbl2.setText("Last Scorer: " + lastScorer);
    }

    public static void setWinner(String winner) {
        but1.setVisible(false);
        but2.setVisible(false);
        lbl.setText("Winner: " + winner);
    }
}
