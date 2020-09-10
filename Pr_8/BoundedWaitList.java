package Pr_8;



public class BoundedWaitList<E> extends WaitList<E> {

    /**
     *Этот список ожидания имеет ограниченную емкость
     * @param capacity, указываемую в момент создания.
     * Он не принимает более элементов, чем заранее задано
     * (возможное количество потенциальных элементов в списке ожидания).
     */

    private final int capacity;

    public BoundedWaitList(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    /**
     *
     * @param element элемент для добавления в список
     * не добавляет элемент если список переполнен
     */

    @Override
    public void add(E element) {
        if (capacity > content.size()) super.add(element);
    }

    @Override
    public String toString() {
        return super.toString() + "capacity : " + capacity ;
    }
}
