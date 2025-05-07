import java.util.Stack;

public class JavaStack {
    public static void main(String[] args) {

        // stack = LIFO data structure. Last-In First-Out
        //               stores objects into a sort of "vertical tower"
        //               push() to add objects to the top
        //               pop() to remove objects from the top

        Stack<String> stack = new Stack<String>();

        stack.push("MD");
        stack.push("Safiul");
        stack.push("Kafi");
        stack.push("Sadik");

        String lastName = stack.pop();
//        String middleName = stack.pop();
//        String firstName = stack.pop();
//        stack.pop();

        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack);

    }
}
