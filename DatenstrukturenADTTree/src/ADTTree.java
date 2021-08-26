public interface ADTTree<T> {

    T root();
    boolean in_tree(T t);
    int elem_sum(T t);
    int size();
}
