public class MyStackPush<T> implements MyStack<T> {

    /* Attributes derived from signature of construtors */
    public T x;
    public MyStack<T> s;
    
    public MyStackPush(T x, MyStack<T> s) {
        this.x = x;
        this.s = s;
    }

    /* Method for push */
    public MyStack<T> push(T y) {
        return new MyStackPush<T>(y, this);
    }
    

    public MyStack<T> pop() {
        assert empty() == false : "The precondition is not satisfied";
        return s;
    }

    public T top() {
        assert empty() == false : "The precondition is not satisfied";
        return x;
    }

    public boolean empty() {
        return false;
    }

    public MyStack<T> add(MyStack<T> t) {
        if (t instanceof MyStackMtStack) {
            return this;
        } else {
            MyStackPush<T> u = (MyStackPush<T>) t;
            MyStack<T> r = this.push(u.x).add(u.s);
            return r;
        }       
    }


    public String toString() {
        return "push("+x+", "+s+")";
    }

}