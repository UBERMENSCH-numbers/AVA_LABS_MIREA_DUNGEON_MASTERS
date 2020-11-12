package Lab_16.cafe.interfaces;


import Lab_16.cafe.menu.MenuItem;

public interface OrdersManager {

    int itemsQuantity(String itemName);
    int itemsQuantity(MenuItem item);
    Order[] getOrders();
    int ordersCostSummary();
    int ordersQuantity();
}
