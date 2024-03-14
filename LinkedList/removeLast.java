package LinkedList;

public class removeLast{
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

    public static int removelast() {
        if (size == 0) {
            System.out.println("The LL is Empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int var = Head.data;
            Head = Tail = null;
            return var;
        }
        Node prev = Head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        Tail = prev;
        size--;
        return val;

    }
    
    public static int removeFirst() {
        if (size == 0) {
            System.out.println("This LL is Empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int var = Head.data;
            Head = Tail = null;
            size = 0;
            return var;
        }
        
        int var = Head.data;
        Head = Head.next;
        size--;
        return var;
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
        // i=ind-1
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
        removeLast ll = new removeLast();
        addFirst(2);
        addFirst(1);
        addLast(3);
        addLast(4);
        addMiddle(2, 9);
        removeFirst();
        removelast();
        print();
        System.out.println(size);
    }
}
