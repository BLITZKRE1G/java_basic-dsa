package collection.queue;

public class BlitzIntegerQueue {

    public BlitzIntegerQueue() {
        this.size = 0;
    }

    private int size;
    private Node root;
    private Node tail;

    public int size() {
        return size;
    }

    public void offer(Integer data) {

        Node node = new Node(data);

        if (root == null) {
            root = node;
            tail = node;
            root.next = tail;
        } else {
            tail.next = node;
            tail = node;
        }

        size++;
    }

    public Integer poll() {
        Node currentNode = root;
        int deletedNodeData = currentNode.data;
        root = root.next;
        size--;
        return deletedNodeData;
    }

    public void printQueue() {
        if (root == null) {
            System.out.println("Empty Queue... Nothing to Print");
        } else {
            System.out.print("FIRST => ");
            Node currentNode = root;
            while (currentNode != tail) {
                System.out.print(currentNode.data + " => ");
                currentNode = currentNode.next;
            }
            System.out.println(tail.data + " => LAST");
        }
    }

    private static class Node {

        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
        }

        public Node(Integer data, Node next) {
            this.data = data;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node: [" +
                    "Data: " + data + ']';
        }
    }
}
