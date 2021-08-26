public class Mt_stack<T> implements Stack<T> {

    public Mt_stack() {
    }

    @Override
    public Stack push(T t) {
        return new MyStack<T>(t, this);
    }

    @Override
    public Stack pop() {
        assert empty()==false: "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public T top() {
        assert empty()==false: "Precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public String toString() {
        return "mt_stack";
    }
}
