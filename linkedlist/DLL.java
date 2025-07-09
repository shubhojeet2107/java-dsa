package linkedlist;

public class DLL {

    private Node head;
    private Node tail;

    // Inserting a node in the start of the list.
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){ 
            head.prev = node; // If list is not empty, update old head’s prev to point to new node.
        }
        head = node;

        if (tail == null) { // If this was the first node added, also update tail.
            tail = node;
        }
    }

    // Inserting a node in the start of the list.
    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head; // pointer

        node.next = null; 

        if(head == null){ // if only one node is there, the one which we are inserting.
            node.prev = null;
            node = head;
            return;
        }

        while (last.next != null){ // traverse till we reach to the last node of the list.
            last = last.next;
        }

        last.next = node; 
        node.prev = last;
    }

    // Inserting a node at any index of the list.
    public void insert(int after, int value){
        Node pointer = find(after);

        if(pointer == null){
            System.out.println("Does'nt Exist");
            return;
        }

        Node node = new Node(value);
        node.next = pointer.next;
        pointer.next = node;
        node.prev = pointer;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node;
        node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public void display(){
        Node start = head;
        Node end = null;
        while(start != null){
            System.out.print(start.value + " -> ");
            end = start; // moving the end pointer point to the last node.
            start = start.next; // updating the start.
        }
        System.out.println("END");

        while(end != null){ // while moving backwards (prev) the end will become null at some point.
            System.out.print(end.value + " -> ");
            end = end.prev; // updating the end.
        }
        System.out.print("START");
    }

    public class Node{
        private int value;
        private Node next;
        private Node prev;

        public Node(int val){
            this.value = val;
        }

        public Node(int val, Node next, Node prev){
            this.value = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
