public class Enqueue<T> implements Queue<T>{

    Queue q;
    T t;

    public Enqueue(T t, Queue<T> q){
        this.q=q;
        this.t=t;
    }


    @Override
    public Queue dequeue() {
        if((q instanceof Mt_queue)){
            return new Mt_queue();
        }
        else {
            return new Enqueue<T>(t, q.dequeue());
        }

    }

    @Override
    public T head() {
        if((q instanceof Mt_queue)){
            return t;
        }
        else {
            return (T) q.head();
        }
    }

    @Override
    public boolean empty() {
        return true;
    }

    @Override
    public String toString() {
        return "enqueue(" + t + ", "+ q + ")";
    }
}

