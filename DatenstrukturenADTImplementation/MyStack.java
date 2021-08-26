interface MyStack<T> {
    public MyStack<T> push(T x);
    public MyStack<T> pop();
    public T top();
    public boolean empty(); 
    public MyStack<T> add(MyStack<T> t);
}