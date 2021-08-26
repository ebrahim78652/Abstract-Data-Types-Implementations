public class MyStack<T> implements Stack<T> {

    private T t;
    private Stack predecessor;



    public MyStack(T t, Stack predecessor) {
        this.t=t;
        this.predecessor= predecessor;
    }

    @Override
    public Stack push(T t) {
        return new MyStack(t, this);
    }

    @Override
    public Stack pop() {
        //don't forget the preconditions;
        assert empty()==false: "preconditions not satisfied.";
        return predecessor;
    }

    @Override
    public T top() {
        assert empty()== false;
        return t;
    }

    @Override
    public boolean empty() {
        return false;
    }

    @Override
    public String toString() {
        return "push(" +t+ ", "+predecessor+")";
    }
}
