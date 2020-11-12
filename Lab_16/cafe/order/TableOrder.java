package Lab_16.cafe.order;


import Lab_16.cafe.menu.MenuItem;
import Pr_16.Item;
import Pr_16.Order;

public class TableOrder implements Order {

    private int size;
    private MenuItem[] items;

    @Override
    public boolean add(Item item) {
        return false;
    }

    @Override
    public boolean removeByName(String name) {
        return false;
    }

    @Override
    public int removeAllByName(String name) {
        return 0;
    }

    @Override
    public int getCount() {
        return 0;
    }

    @Override
    public Item[] toArray() {
        return new Item[0];
    }

    @Override
    public int getOrderPrice() {
        return 0;
    }

    @Override
    public int countOf(String name) {
        return 0;
    }

    @Override
    public String[] allNames() {
        return new String[0];
    }

    @Override
    public Item[] toSortedArray() {
        return new Item[0];
    }
}
