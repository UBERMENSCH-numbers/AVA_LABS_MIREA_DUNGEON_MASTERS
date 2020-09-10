package Lab_6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics extends JFrame {
    private JButton but;
    private JTextArea text;
    private JLabel msg;
    private Controller controller;

    Graphics (Controller controller) {
        this.controller = controller;
        controller.setGraphics(this);
        setLayout(new GridLayout(3,1));
        but = new JButton("Guess");
        text = new JTextArea(1,3);
        msg = new JLabel("Try to guress number from 0 to 20");
        setSize(500,200);
        add(msg);
        add(text);
        add(but);
        but.addActionListener(e -> {
            try {
                int i = Integer.parseInt(text.getText());
                controller.try_(i);
                text.setText("");
            } catch (NumberFormatException ex) {
                msg.setText("enter number from 0 to 20");
                text.setText("");
            }
        });
        setVisible(true);
    }

    public void setMsg(String text) {
        msg.setText(text);
    }

    public void gameOver(String text) {
        msg.setText(text);
        but.setVisible(false);
        this.text.setVisible(false);
        controller = null;
    }
}
