public class Main {

    public static void main(String[] args) {
        Stack empty= new Mt_stack();
        System.out.println(empty);

        Stack element= empty.push(2);
        System.out.println(element);

        Stack element2= element.push(6);
        System.out.println(element2);
        System.out.println(element2.top());

        Stack element3= element2.pop();
        System.out.println(element3);
    }
}
