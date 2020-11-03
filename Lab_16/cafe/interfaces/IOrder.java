package Lab_16.cafe.interfaces;

import Lab_16.cafe.menu.MenuItem;

public interface IOrder {
   public boolean add(MenuItem item);
   public String[] itemsNames();
   public int itemQuantity(); // количество заказов
   public int itemQuantity(String itemName);
   public int itemQuantity(MenuItem menuItem);
   public MenuItem[] getItems();
   public boolean remove(String itemName);
   public boolean removeAll(MenuItem item);
   public MenuItem[] sortedItemsByCostDesc();
   public int costTotal();

}
