public class Node<T> implements ADTTree<T>
{
    private T t;
    private ADTTree subTree1;
    private ADTTree subTree2;

    public Node(T t, ADTTree subTree1, ADTTree subTree2){
        this.t=t;
        this.subTree1= subTree1;
        this.subTree2= subTree2;
    }


    @Override
    public T root() {
        return t;
    }

    @Override
    public boolean in_tree(T t) {
        if(t==this.t){
            return true;
        }
        else{
            return subTree1.in_tree(t) ||subTree2.in_tree(t);
        }
    }

    @Override
    public int elem_sum(T t) {
        if(t==this.t){
            return (1+ subTree1.elem_sum(t)+ subTree2.elem_sum(t));
        }
        else{
            return subTree1.elem_sum(t)+ subTree2.elem_sum(t);
        }
    }

    @Override
    public int size() {
        return 1+ subTree1.size()+ subTree2.size();
    }

    @Override
    public String toString() {
        return "node("+ t +", subNode1("+ subTree1 +")"+", subnode2("+subTree2 + ")";
    }
}
