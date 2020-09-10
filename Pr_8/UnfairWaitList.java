package Pr_8;

public class UnfairWaitList<E> extends WaitList<E> {

    /**
     *  В этом списке ожидания, можно удалить элемент ,
     *  который не является первым в очереди - и помните он не может вернуться обратно!
     *  Также возможно, чтобы  например, первый элемент будет отправлен обратно в конец списка.
     */

    public UnfairWaitList() {
    }


    /**
     * удаляет элемент если он не первый в очереди
     * @param element элемент для удаления
     */
    public void remove(E element) {
        if (content.peek() != element) content.remove(element);
    }

    /**
     * перемещает элемент в конец очереди
     * @param element элемент для перемещения в конец
     */

    public void moveToBack(E element) {
        content.offer(element);
        content.remove(element);
    }
}
