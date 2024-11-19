import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("item 1");
        stack.push("item 2");
        stack.push("item 3");
        stack.push("item 4");

        System.out.println("Stack: " + stack);
        System.out.println("Top element (peek): " + stack.peek());
        System.out.println("Removed element (pop): " + stack.pop());
        System.out.println("Stack after pop: " + stack);

        System.out.println("is the stack empty? " + stack.isEmpty());
    }
}
