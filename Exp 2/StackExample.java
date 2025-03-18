import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack after pushes: " + stack);

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("Peeked element: " + stack.peek());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}

