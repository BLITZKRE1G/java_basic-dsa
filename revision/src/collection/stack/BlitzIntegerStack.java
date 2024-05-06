package collection.stack;

public class BlitzIntegerStack {

    public BlitzIntegerStack() {
        this.size = 0;
    }

    private int size;
    private Node root;
    private Node tail;

    public int size() {
        return this.size;
    }

    public Integer getRoot() {
        return root.getData();
    }

    public Integer getTail() {
        return tail.getData();
    }

    public void push(Integer data) {
        Node node = new Node(data);
        if (tail == null) {
            node.previous = tail;
            tail = node;
            node.previous = root;
            root = node;
        } else {
            node.previous = tail;
            tail = node;
        }
        size++;
    }

    public Integer pop() {
        if (size > 1) {
            Node deletedNode = tail;
            tail = tail.previous;
            size--;
            return deletedNode.data;
        } else {
//            System.out.println("Nothing to Pop, Empty Stack!");
            throw new RuntimeException("Nothing to Pop, Empty Stack!");
        }
    }

    public void insert(int index, int data) {
        if (root == null) {
            push(data);
        } else if (index == 0) {
            push(data);
        } else {
            Node node = tail;
            for (int i=1; i<index; i++) {
                node = node.previous;
            }
            node.previous = new Node(data, node.previous);
            size++;
        }
    }

    public void printStack() {

        Node node = tail;
        System.out.print("LAST <= ");
        while (node != root) {
            System.out.print(node.data + " <= ");
            node = node.previous;
        }
        System.out.println(root.data + " <= START");
    }

    public void reverse() {
        Integer[] dataArray = makeArray();
        int index = 0;
        Node node = new Node(dataArray[size-1-index++]);
        tail = node;
        for (int i=size-2; i>=0; i--) {
            node.previous = new Node(dataArray[size-1-index++]);
            node = node.previous;
        }
        root = node;
        printStack();
    }

    private Integer[] makeArray() {
        Node currentNode = tail;
        Integer[] array = new Integer[size];
        int index = 0;
        while (currentNode != root) {
            array[index] = currentNode.data;
            currentNode = currentNode.previous;
            index++;
        }
        array[index] = currentNode.getData();
        return array;
    }

    private static class Node {

        private Integer data;
        private Node previous;

        protected Integer getData() {
            return data;
        }

        public Node(Integer data) {
            this.data = data;
        }

        public Node(Integer data, Node previous) {
            this.data = data;
            this.previous = previous;
        }
    }
}
