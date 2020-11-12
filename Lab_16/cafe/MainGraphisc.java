package Lab_16.cafe;



import Lab_16.cafe.menu.Dish;
import Lab_16.cafe.menu.Drink;
import Lab_16.cafe.menu.DrinkTypeEnum;
import Lab_16.cafe.order.InternetOrder;



import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MainGraphisc extends JFrame {
    private JPanel panel;
    private JMenuBar menuBar;
    private JTextArea textArea;
    private InternetOrder internetOrder;

    public MainGraphisc(){
        super("Кабинет пользователя");
         internetOrder = new InternetOrder();



        setSize(700,500);
        this.panel=new JPanel();
        this.menuBar= new JMenuBar();
        this.textArea= new JTextArea(1,1);
        textArea.setFont(new Font("TimesRoman",Font.BOLD,20));
        textArea.setBackground(Color.pink);



        JMenu drink=new JMenu("Добавить напитки");
        JMenu dish = new JMenu("Добавить блюдо");
        JMenu do_ = new JMenu("Оформить заказ");

        add(textArea);


        JMenuItem do__= new JMenuItem("Приступить к оформлению заказа");

        JMenuItem juice= new JMenuItem("Сок");

        JMenuItem water= new JMenuItem("Вода");
        JMenuItem wine= new JMenuItem("Вино");

        JMenuItem rice= new JMenuItem("Рис");
        JMenuItem chiken= new JMenuItem("Курица");
        JMenuItem potatoes= new JMenuItem("Картошка");
        do__.addActionListener(e -> {
            SummaryGraphics endWindow = new SummaryGraphics(internetOrder);
            endWindow.setVisible(true);
            setVisible(false);

        });

        juice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= new Drink(100,"Сок"," ",0, DrinkTypeEnum.JUICE);
                internetOrder.add(drink1);
                textArea.append("Сок добавлен в заказ \n");
            }
        });

        water.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Drink drink1= new Drink(90,"Вода"," ",0, DrinkTypeEnum.JUICE);
                internetOrder.add(drink1);
                textArea.append("Вода добавлена в заказ \n");
            }
        });
        wine.addActionListener(e -> {
            Drink drink1= new Drink(300,"Вино"," ",0, DrinkTypeEnum.JUICE);
            internetOrder.add(drink1);
            textArea.append("Вино добавлено в заказ \n");
        });
        rice.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(100,"Рис"," ");
                internetOrder.add(dish1);
                textArea.append("Рис добавлен в заказ \n");
            }
        });
        chiken.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(150,"Курица"," ");
                internetOrder.add(dish1);
                textArea.append("Курица добавлена в заказ \n");
            }
        });
        potatoes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Dish dish1= new Dish(80,"Картошка"," ");
                internetOrder.add(dish1);
                textArea.append("Картошка добавлена в заказ \n");
            }
        });


        drink.setMnemonic(KeyEvent.VK_C);
        dish.setMnemonic(KeyEvent.VK_C);
        do_.setMnemonic(KeyEvent.VK_C);

        drink.add(juice);
        drink.add(water);
        drink.add(wine);
        dish.add(rice);
        dish.add(chiken);
        dish.add(potatoes);
        do_.add(do__);


        menuBar.add(drink);
        menuBar.add(dish);
        menuBar.add(do_);


        setJMenuBar(menuBar);


    }
}
