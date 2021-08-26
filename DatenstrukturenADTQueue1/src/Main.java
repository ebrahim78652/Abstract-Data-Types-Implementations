public class Main {

    public static void main(String[] args) {
        var q0 = new Mt_queue<>();
        var q1 = new Enqueue<>(7000,q0);
        var q2 = new Enqueue<>(7,q1);
        var q3 = new Enqueue<>(6,q2);
        var q4 = new Enqueue<>(3,q3);
        var q5 = new Enqueue<>(7,q4);




        Queue q6 = q5.dequeue();
        System.out.println(q6.head());
    }
}
