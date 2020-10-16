package Pr_10.task3;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Graphics extends JFrame implements IGraphics {
    Container container;
    IController graphicsController;
    JTextField jTextField;

    public Graphics(IController controller) {
        super("LABABABA");
        this.graphicsController = controller;
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        setSize(500, 500);
        container = getContentPane();
        prepareMenu();
        setVisible(true);
    }

    void prepareMenu() {
        JMenuBar jMenuBar = new JMenuBar();
        JMenu jMenuFile = new JMenu("File");
        JMenuItem jMenuNew = new JMenuItem("New");
        JMenuItem jMenuOpen = new JMenuItem("Open");
        JMenuItem jMenuSave = new JMenuItem("Save");
        JMenuItem jMenuExit = new JMenuItem("Exit");
        jMenuFile.add(jMenuNew);
        jMenuFile.add(jMenuOpen);
        jMenuFile.add(jMenuSave);
        jMenuFile.add(jMenuExit);
        jMenuBar.add(jMenuFile);
        container.add(jMenuBar, BorderLayout.NORTH);
        jMenuNew.addActionListener(actionEvent -> graphicsController.onFileNewAction(this));
        jMenuOpen.addActionListener(actionEvent -> graphicsController.onFileOpenAction(this));
        jMenuSave.addActionListener(actionEvent -> graphicsController.onFileSaveAction(this, jTextField.getText()));
        jMenuExit.addActionListener(actionEvent -> graphicsController.onFileExitAction(this));

    }

    @Override
    public void closeDocument() {
        container.remove(jTextField);
        repaint();

    }

    @Override
    public void exitProgram() {
        setVisible(false);
        dispose();
        exitProgram();


    }

    @Override
    public void createTextSpace(String text) {
        jTextField= new JTextField("textinput");
//        jTextField.setBounds(0, 200, 0, 200);
        jTextField.setText(text);
        container.add(jTextField);
        setVisible(true);
    }
}