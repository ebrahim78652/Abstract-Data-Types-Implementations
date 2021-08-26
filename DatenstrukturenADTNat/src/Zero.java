public class Zero implements MyNat {

    //will not contains any attributes;



    //it will contain an empty constructor;
    //sine no attributes are present.
    public Zero(){
    }


    @Override
    public MyNat succ() {
        //will basically return a natural number whose predecessor is 0, because the constructor takes predecessor as
        //argument.

        return new Succ(this);
    }


    @Override
    public boolean less(MyNat nat) {
        if(nat instanceof Succ){
            return true;
        }
        else return false;
    }

    @Override
    public MyNat pred() {
        //the precondition means: that it can only be called on numbers that are bigger than 0

        MyNat zero= new Zero();

        // if the assert statement gives false then the text after the colon will get printed
        assert zero.less(this): "Precondition not satistfied.";
        //the above statement of assert evaluates to false every time.
        //and hence everytime "Precondition not satisfied will get printed.

        throw new IllegalStateException();
        // and the code will throw this exception in the end, because your program was trying to find the predecessor
        //of zero.
    }


    @Override
    public MyNat add(MyNat nat) {
        return nat;
    }

    @Override
    public MyNat mult(MyNat nat) {
        return new Zero();
    }

    @Override
    public String toString() {
        return "zero";
    }
}
