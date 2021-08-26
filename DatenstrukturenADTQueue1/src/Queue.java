public interface Queue<T> {

    Queue dequeue();
    T head();
    boolean empty();
}
