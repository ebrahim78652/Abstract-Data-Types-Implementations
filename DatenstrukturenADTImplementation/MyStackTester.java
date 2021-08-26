class MyStackTester {
    public static void main(String args[]) {
        /* Creation of an empty stack */
        MyStack<String> a = new MyStackMtStack<String>();
        MyStack<String> b,c;
        System.out.println("mt_stack = "+a);

        /* Test operation empty() for mt_stack */
        System.out.println("empty("+a+") = "+a.empty());

        /* Add an element to the stack */
        System.out.print("push(A, "+a+") = ");
        a = a.push("A");
        System.out.println(a);

        /* Test operation top() on non-empty stack */
        System.out.println("top("+a+") = "+a.top());        

        /* Test operation empty() on non-empty stack */
        System.out.println("empty("+a+") = "+a.empty());

        /* Add an element to the stack */
        System.out.print("push(B, "+a+") = ");
        a = a.push("B");
        b = a;
        System.out.println(a);

        /* Add an element to the stack */
        System.out.print("push(C, "+a+") = ");
        a = a.push("C");
        c = a;
        System.out.println(a);

        /* Test operation top() on non-empty stack */
        System.out.println("top("+a+") = "+a.top());               

        /* Test operation empty() on non-empty stack */
        System.out.println("empty("+a+") = "+a.empty());

        /* Remove an element from the stack */
        System.out.print("pop("+a+") = ");    
        a = a.pop();
        System.out.println(a);

        /* Remove an element from the stack */
        System.out.print("pop("+a+") = ");
        a = a.pop();
        System.out.println(a);

        /* Remove an element from the stack */
        System.out.print("pop("+a+") = ");
        a = a.pop();
        System.out.println(a);

        /* Pop on empty stack shall violate the precondition */
        // System.out.print("pop("+a+") = ");
        // a = a.pop();
        // System.out.println(a);  

        /* Test Add */
        System.out.print("add("+b+","+c+") = ");
        b = b.add(c);
        System.out.println(b);  

    }
}