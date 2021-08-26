public class Main {

    public static void main(String[] args) {
        //first lets try making a leaf;
        ADTTree emptyleaf= new Leaf();
        ADTTree emptyleaf2= new Leaf();
        System.out.println(emptyleaf);

        ADTTree node1= new Node(1, emptyleaf, emptyleaf2);
        System.out.println(node1);

        ADTTree node2= new Node(2, node1, emptyleaf);
        System.out.println(node2);

        ADTTree node3= new Node(2, node2, new Node(2, emptyleaf, emptyleaf2));
        System.out.println(node3.elem_sum(2));
        System.out.println(node3.size());
        System.out.println(node3.in_tree(1));
        System.out.println(node3.in_tree(5));
        //working fine
    }
}
