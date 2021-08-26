class MyStackMtStack<T> implements MyStack<T> {

    //notice no aatributes here.
   
    /* Constructor mt_stack */
    public MyStackMtStack() {
    }

    /* Constructor push */
    public MyStack<T> push(T x) {
        return new MyStackPush<T>(x, this);
    }


    public MyStack<T> pop() {        
        assert empty() == false : "The precondition is not satisfied";
        throw new IllegalStateException("Operation undefined for empty stack");
    }

    public T top() {
        assert empty() == false : "The precondition is not satisfied";
        throw new IllegalStateException("Operation undefined for empty stack");
    }

  
    public boolean empty() {
        return true;
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
        return "mt_stack";
    }
}