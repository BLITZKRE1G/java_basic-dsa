import collection.stack.BlitzIntegerStack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Cmd+1 with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

//        // Press Cmd+Shift+F11 or click the green arrow button in the gutter to run the code.
//        for (int i = 1; i <= 5; i++) {
//
//            // Press Cmd+F11 to start debugging your code. We have set one breakpoint
//            // for you, but you can always add more by pressing Cmd+Shift+B.
//            System.out.println("i = " + i);
//        }

//        BlitzIntegerQueue queue = new BlitzIntegerQueue();
//        queue.printQueue();
//        System.out.println(queue.size());
//        queue.offer(0);
//        queue.offer(1);
//        queue.offer(2);
//        queue.offer(3);
//        queue.printQueue();
//        System.out.println(queue.size());
//        System.out.println(queue.poll());
//        queue.printQueue();
//        System.out.println(queue.size());
//        queue.offer(null);
//        queue.printQueue();

        BlitzIntegerStack stack = new BlitzIntegerStack();
        stack.push(0);
        stack.printStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.size());
        stack.printStack();
        System.out.println(stack.pop());
        System.out.println(stack.size());
        stack.printStack();
        stack.insert(1, 99);
        stack.printStack();
        System.out.println(stack.size());
        System.out.println("Root: " + stack.getRoot());
        System.out.println("Tail: " + stack.getTail());
        stack.reverse();
        System.out.println("Root: " + stack.getRoot());
        System.out.println("Tail: " + stack.getTail());
    }
}