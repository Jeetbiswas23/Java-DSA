package LinkedList;

public class printLinkeList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node Head;
    public static Node Tail;

    public static void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null"); // Change the ending message
    }

    public static void addLast(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public static void main(String args[]) {
        printLinkeList ll = new printLinkeList();
        ll.print();
        addFirst(2);
        ll.print();
        addFirst(1);
        ll.print();
        addLast(3);
        ll.print();
        addLast(4);
        ll.print();

        /*Output for this code
         * null
         2 --> null
        1 --> 2 --> null
        1 --> 2 --> 3 --> null
        1 --> 2 --> 3 --> 4 --> null
         */
    }
}
