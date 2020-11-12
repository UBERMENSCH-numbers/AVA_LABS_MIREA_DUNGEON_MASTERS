package Lab_16.cafe;


import Lab_16.cafe.order.InternetOrder;


import javax.swing.*;
import java.awt.*;


public class SummaryGraphics extends JFrame {

    private InternetOrder internetOrder;
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;


    public SummaryGraphics(final InternetOrder internetOrder){
        super("Оформить заказ");
        setDefaultCloseOperation( EXIT_ON_CLOSE );

        this.internetOrder=internetOrder;

        setSize(700,500);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman",Font.BOLD,20));
        textArea.setBackground(Color.CYAN);

        add(textArea);

        textArea.append("Позиции \n");
        String context =new String();
        var menuItem=internetOrder.getItems();
        for(var menuItem1:menuItem){
            if(menuItem1!=null)
                context+=menuItem1.getName()+" \n";
        }
        textArea.setText(context);
        textArea.append("Цена : " + internetOrder.costTotal());



    }
}
