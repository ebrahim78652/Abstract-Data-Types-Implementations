public interface MyNat {

    public MyNat succ();
    public MyNat pred();
    public boolean less(MyNat nat);
    public MyNat add(MyNat nat);
    MyNat mult(MyNat nat);

}
