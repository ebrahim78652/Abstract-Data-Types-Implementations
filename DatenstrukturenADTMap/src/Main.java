import Map.ADTMap;
import Map.Mt_map;
import Map.*;


public class Main {

    public static void main(String[] args) {
        ADTMap empty= new Mt_map();
        System.out.println(empty);
        Insert element1= new Insert();
        element1.Insert(1234, "ebrahim", empty);
        System.out.println(element1);
        ADTMap element2= element1.delete(1234);
        System.out.println(element2);

    }
}
