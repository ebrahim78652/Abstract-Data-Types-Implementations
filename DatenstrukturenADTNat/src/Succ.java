//in this entire code: nat= j
// and this.nat= i

public class Succ implements MyNat {



    //it has one parameter.
    //this is the predecessor
    MyNat nat;

    //the constructor will initialise this parameter.
    Succ(MyNat nat){
        this.nat=nat;
    }


    @Override
    public MyNat succ() {
        return new Succ(this);
    }

    @Override
    public MyNat pred() {
        //first the functions will check if we are  greater than 0 or no.
        //if we are not greater than 0, that means we are 0 and have no predecessor:
        // then the text "precondition not satisfied will get printed;

        MyNat zero= new Zero();
        assert zero.less(this): "Precondition not satisfied";

        //else the below line gets printed.
        return nat;
    }

    @Override
    public boolean less(MyNat nat) {
        if (nat instanceof Zero){
            return false;
        }
        else{
            return this.nat.less(nat.pred());
        }
    }

    @Override
    public MyNat add(MyNat nat) {
        return this.nat.add(nat).succ();
    }

    @Override
    public MyNat mult(MyNat nat) {
        return nat.add(this.nat.mult(nat));
    }

    @Override
    public String toString() {
        return "succ("+this.nat+")";

    }
}
