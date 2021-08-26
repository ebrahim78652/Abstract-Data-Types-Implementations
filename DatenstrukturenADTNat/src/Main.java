public class Main {

    public static void main(String[] args) {
        MyNat zero= new Zero();
        System.out.println(zero);

        MyNat two= zero.succ().succ();
        System.out.println("two="+two);

        MyNat three= two.succ();
        System.out.println("Three= "+three);

        System.out.println(three.pred());
        System.out.println(three.less(zero));
        System.out.println(zero.less(three));

        System.out.println(three.mult(two));
        System.out.println(three.add(two));

        //tested all functions and all are working fine,
        //till now only not understood, why the "precondition not satisfied"
        // doesnt get printed when we do zero.pred();
        // and only the exception gets thrown.

    }
}
