package LinkedList;

public class searchrecursivell{
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null; // Correct initialization
        }
    }

    public static Node Head;
    public static Node Tail;

    public static int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int ind = helper(head.next, key);
        if (ind == -1) {
            return -1;
        }
        return ind + 1;
    }

    public static int searchRecursive(int key) {
        return helper(Head, key);
    }

    public static void printll() {
        Node temp = Head;
        while (temp != null) {
            System.out.print(temp.data + "--> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void addFirst(int data) {
        Node nb = new Node(data);
        if (Head == null) {
            Head = Tail = nb;
            return;
        }
        nb.next = Head;
        Head = nb;
    }

    public static void addLast(int data) {
        Node nb = new Node(data);
        if (Head == null) {
            Head = Tail = nb;
            return;
        }
        Tail.next = nb;
        Tail = nb;
    }

    public static void main(String[] args) {
        searchrecursivell ll = new searchrecursivell(); // Changed to correct class name
        addFirst(2);
        addFirst(3);
        addFirst(5);
        addLast(9);
        addLast(9);
        printll();
        System.out.println(searchRecursive(3));
        System.out.println(searchRecursive(19));
    }
}
