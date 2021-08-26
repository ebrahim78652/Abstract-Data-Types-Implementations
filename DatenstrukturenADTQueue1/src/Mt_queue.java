public class Mt_queue<T> implements Queue<T>{

    @Override
    public Queue dequeue() {
        return this;
    }

    @Override
    public T head() {
        assert empty()== false: "Precondition not satisfied";
        throw  new IllegalStateException();
    }

    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public String toString() {
        return "emptyQueue";
    }

}

