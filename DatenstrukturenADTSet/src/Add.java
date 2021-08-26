public class Add<T> implements Set<T> {

    //attrbiutes
    private T t;
    private Set predecessorSet;

    //public constructor which initialises
    public Add(T t, Set predecessorSet){
        this.t= t;
        this.predecessorSet= predecessorSet;
    }

    //all below functions are defined for add
    //all of the below functions do not have any preconditions.
    @Override
    public boolean is_in(T t) {
        if(t==this.t){
            return true;
        }
        else return predecessorSet.is_in(t);
    }


    @Override
    public Set delete(T t) {
        if(t==this.t){
            return predecessorSet.delete(t);
        }
        else{
            return new Add(this.t, predecessorSet.delete(t));
        }
    }

    //here the toString method prints using the constructors
    @Override
    public String toString() {
        return "add(" + t + ", "+ predecessorSet + ")";
    }
}
