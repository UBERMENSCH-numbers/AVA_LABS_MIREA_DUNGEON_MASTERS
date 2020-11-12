package Lab_16.cafe.order;

import Lab_16.cafe.interfaces.Order;
import Lab_16.cafe.interfaces.OrdersManager;
import Lab_16.cafe.menu.MenuItem;


public class InternetOrdersManager implements OrdersManager {

    private QueueNode head;
    private QueueNode tail;
    private int size;


    boolean add(Order order) {
        return false;
    }

    @Override
    public int itemsQuantity(String itemName) {
        return 0;
    }

    @Override
    public int itemsQuantity(MenuItem item) {
        return 0;
    }

    @Override
    public Order[] getOrders() {
        return new Order[0];
    }

    @Override
    public int ordersCostSummary() {
        return 0;
    }

    @Override
    public int ordersQuantity() {
        return 0;
    }
}
