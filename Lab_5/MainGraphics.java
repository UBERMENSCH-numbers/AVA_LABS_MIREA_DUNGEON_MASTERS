package Lab_5;

import Pr_5.Main;

import javax.swing.*;
import java.awt.*;

public class MainGraphics extends JFrame {
    private static JLabel jl;

    MainGraphics () throws InterruptedException {
        super("example");
        setLayout(new FlowLayout());
        setSize(250,300);
        jl = new JLabel();
        add(jl);
        setVisible(true);
        AnimationController ac = new AnimationController();
        ac.startAnim();
    }

    public static void setPicture(String path) {
        jl.setIcon(new ImageIcon(path));
    }
}
