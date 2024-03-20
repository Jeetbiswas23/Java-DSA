package LinkedList;

public class ReverseLL {
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
    public static int size;

    public static void reverseLL() {
        Node prev = null;
        Node curr = Head;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        Head = prev;
    }

    public static void print() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null"); // Change the ending message
    }

    public static void addFirst(int data) {
        // Create new Node
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        // new node next=head
        newNode.next = Head; // This is Linking

        // head=new node
        Head = newNode;
    }

    public static void addLast(int data) {
        // Create new Node
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public static void main(String args[]) {
        ReverseLL ll = new ReverseLL();
        addFirst(1);
        addFirst(2);
        addLast(3);
        addLast(4);
        print();
        reverseLL();
        print();
    }
}
