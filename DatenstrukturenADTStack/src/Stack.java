public interface Stack<T> {
    Stack push(T t);
    Stack pop();
    T top();
    boolean empty();
}
