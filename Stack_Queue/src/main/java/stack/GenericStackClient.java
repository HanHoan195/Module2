package stack;

public class GenericStackClient {
    private static void stackOfIString(){
        MyGenericStack<String> stack = new MyGenericStack();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");

        System.out.println("1.1 Size off stack after push operations: " + stack.size());
        System.out.println("1.2 Pop elements from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %s", stack.pop());
        }
        System.out.println("\n1.3 Size of stack after pop operation: " +stack.size());
    }

    private static void stackOfItergers(){
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push operation: " + stack.size());
        System.out.printf("2.2 Pop element from stack: ");
        while (!stack.isEmpty()){
            System.out.printf(" %d", stack.pop());
        }
        System.out.println("\n3.3 Size of stack after pop opertion : " + stack.size());


    }

    public static void main(String[] args) {
        System.out.println("1. Stack of intergers");
        stackOfItergers();
        System.out.println("\n2. Stack of String");
        stackOfIString();
    }
}
