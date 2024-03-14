package LinkedList;

public class searchLinkedList{
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

    public static int searchLL(int key) {  //O(n) Time Complexity
        Node temp = Head;
        int in = 0;
        while (temp != null) {
            if (temp.data == key) {
                return in;
            }
            temp = temp.next;
            in++;

        }
        
        return -1;
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
        //Create new Node
        Node nb = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = nb;
            return;
        }
        //new node next=head
        nb.next = Head;//This is Linking 

        //head=new node
        Head = nb;

    }

    public static void addLast(int data) {
        //Create new Node
        Node nb = new Node(data);
        size++;
        if (Head == null) {
            Head = Tail = nb;
            return;
        }
        Tail.next = nb;
        Tail = nb;
        
    }

    public static void main(String args[]) {
        searchLinkedList ll = new searchLinkedList();
        addFirst(1);
        addFirst(2);
        addLast(3);
        addLast(4);
        print();
        System.out.println(searchLL(3));
        System.out.println(searchLL(10));


        //This is making LinkedList as Head 1 -> 2 -> 3 -> 4 Tail
    }
    
    
}
