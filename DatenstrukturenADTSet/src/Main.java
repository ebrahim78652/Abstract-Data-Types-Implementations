public class Main {

    public static void main(String[] args) {
        Set empty= new Mt_set();
        //in java, a superclass variable containing a
        //child class object doesnt need to have virtual function
        //so that overridden methods can be called from the upperclass.
        System.out.println(empty);

        Set set1= new Add(2, empty);
        System.out.println(set1);

        Set set2= new Add(3, set1);
        System.out.println(set2);

        Set set3= new Add(5, set2);

        Set set4= new Add(7, new Add(2, set3));
        System.out.println(set4);

        Set set5= set4.delete(2);
        System.out.println(set5);

        System.out.println(set5.is_in(7));
        System.out.println(set5.is_in(70));

    }
}
