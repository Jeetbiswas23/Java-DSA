package LinkedList;

public class sizeLinkedList{
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
        size++;
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
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        Tail.next = newNode;
        Tail = newNode;
    }

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = newNode;
            return;
        }
        newNode.next = Head;
        Head = newNode;
    }

    public static void main(String args[]) {
        sizeLinkedList ll = new sizeLinkedList();
        addFirst(2);
        addFirst(1);
        addLast(3);
        addLast(4);
        addMiddle(2, 9);
        ll.print();
        System.out.println(ll.size);


    }
}


