package LinkedList;

public class middleLinkedList{
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

    public static void addMiddle(int ind, int data) {
        if (ind == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = Head;
        int i = 0;
        while (i < ind - 1) {
            temp = temp.next;
            i++;
        }
        //i=ind-1
        newNode.next = temp.next;
        temp.next = newNode;



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
        middleLinkedList ll = new middleLinkedList();
        addFirst(2);
        addFirst(1);
        addLast(3);
        addLast(4);
        addMiddle(2, 9);
        ll.print();


    }
}

