package LinkedList;

public class addlast {
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

    public static void addFirst(int data) { //Time Complexity is constant O(1)
        //Create new Node
        Node nb = new Node(data);
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
        if (Head == null) {
            Head = Tail = nb;
            return;
        }
        Tail.next = nb;
        Tail = nb;
        
    }

    public static void main(String args[]) {
        addlast ll = new addlast();
        addFirst(1);
        addFirst(2);
        addLast(3);
        addLast(4);

        //This is making LinkedList as Head 1 -> 2 -> 3 -> 4 Tail
    }
    
    
}
