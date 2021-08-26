public class Leaf<T> implements ADTTree<T> {

    //there will be no attributes since the constructor leaf does
    //not have any parameters.

    //make an empty constructor

    public Leaf(){

    }


    @Override
    public T root() {
        assert (this instanceof Leaf) : "precondition not satisfied";
        throw new IllegalStateException();
    }

    @Override
    public boolean in_tree(T t) {
        return false;
    }

    @Override
    public int elem_sum(T t) {
        return 0;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public String toString() {
        return "leaf";
    }
}
