package Pr_11;

import java.util.Objects;

class ArrayQueue<T> implements IQueue<T> {
    private Object[] queue;
    private int maxSize; // максимальное количество элементов в очереди
    private int nElem;  // текущее количество элементов в очереди
    private int front;
    private int rear;


    public ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        queue = new Object[maxSize];
        rear = -1;
        front = 0;
        nElem = 0;
    }

    @Override
    public void Enqueue(T element) {
        if(maxSize != nElem) {
            if (rear == maxSize - 1) {  // циклический перенос
                rear = -1;
            }

            queue[++rear] = element;  //увеличение Rear и вставка
            nElem++;  // увеличение количества элементов в очереди
        }
    } // предусловие : maxsize != nElem
    // постусловие : maxsize >= nElem

    @Override
    public T Element() {
        return (T)queue[front];
    } // постусловие : nElem > 1

    @Override
    public T Dequeue() {
        Object temp = queue[front++]; // получаем первый элемент из очереди
        if (front == maxSize) { // циклический перенос
            front = 0;
        }
        nElem--; // уменьшаем количество элементов в очереди
        return (T)temp;
    } // предусловие : nElem != 0
    // постусловие : -1 > nElem < maxSize

    @Override
    public int Size() {
        return nElem;
    }

    @Override
    public boolean IsEmpty() {
        return nElem==0;
    }

    @Override
    public void Clear() {
        while (nElem!=0) Dequeue();
    }
}

//инварианты :
//    nelem <= maxsize
//    |front-rear| < maxsize