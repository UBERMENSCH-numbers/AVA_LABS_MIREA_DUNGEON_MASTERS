package Pr_11;


public interface IQueue<T> {

    void Enqueue(T element) throws IllegalArgumentException;
    T Element();
    T Dequeue(); // size != null
    int Size();
    boolean IsEmpty();
    void Clear();
}
