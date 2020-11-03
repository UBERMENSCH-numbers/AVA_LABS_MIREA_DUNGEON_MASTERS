package Pr_11;

public class ArrayQueueTest {
    static void test () {
        ArrayQueue arrayQueue = new ArrayQueue(5);
        arrayQueue.Enqueue(1);
        arrayQueue.Enqueue(2);
        arrayQueue.Enqueue(3);
        arrayQueue.Enqueue(4);
        arrayQueue.Enqueue(5);
        System.out.println(arrayQueue.Size() == 5);
        System.out.println((int) arrayQueue.Element() == 1);
        System.out.println((int) arrayQueue.Dequeue() == 1);
        System.out.println((int) arrayQueue.Element() == 2);
        System.out.println(arrayQueue.Size() == 4);

        arrayQueue.Enqueue(10);
        arrayQueue.Enqueue(11);
        arrayQueue.Enqueue(12);
        System.out.println(arrayQueue.Size() == 5);
        System.out.println((int)arrayQueue.Element() == 2);
        arrayQueue.Clear();
        System.out.println(arrayQueue.Size() == 0);
    }
}
