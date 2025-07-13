package linkedlist;

public class LL {

    // head and tail stores a reference to a Node object.
    private Node head;
    private Node tail;

    // size is just a number — an integer.
    private int size;

    public LL() {
        this.size = 0;
    }

    // Inserting a node in the start of the list.
    public void insertFirst(int val){
        Node node = new Node(val); // this will use the first constructor to create a node.
        node.next = head; // pointing the new node to already existed list. 
        head = node; // marking the first node as head.

        if(tail == null){ // if there's only one node, tail will also point towards the same as head.
            tail = head;
        }
        size += 1;
    }

    // Inserting a node at the end of the list.
    public void insertLast(int val){
        if(tail == null){ // If the list is currently empty (i.e., no nodes), then tail hasn’t been set yet — it's still null.
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++ ;
    }

    // Inserting a node at any index of the list.
    public void insert(int val, int index){
        if(index == 0){
            insertFirst(val);
            return;
        }

        if(index == size){
            insertLast(val);
            return;
        }

        Node temp = head; // creating a temporary node in the position of head so that head does'nt change its position.
        for(int i=1; i<index; i++){
            temp = temp.next; // since loop is starting from 1, thus the temp is pointing towards the next node.
        }

        Node node = new Node(val, temp.next);
        temp.next = node; // after the loop breaks, the temp is positioned before the index at which new node is to be inserted, thus it is pointing towards the next node which is the new node.

        size++ ; 
    }


    // Inserting a node at any index of the list with recursion.
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node); // creating a new node.
            size ++; 
            return temp; // returning the node created in the base case.
        }

        node.next = insertRec(value, index-1, node.next); // storing the value of each node in itself in each recursion call.
        return node;
    }


    // Deleting the first node from the list.
    public int deleteFirst(){
        int value = head.value; 
        head = head.next; // Moving the head towards the next node, will automatically change the structure of the list.

        if(head == null){
            tail = null; // incase there's only one node.  
        }

        size-- ;
        return value; // To know the value which got deleted.
    }

    // Deleting the last node from the list.
    public int deleteLast(){
        if(size <= 1){ // inacase there's only one node, thus call the deletefirst fun() 
            return deleteFirst();
        }

        Node secondlast = get(size - 2); // pointing out the secondlast node because the last node will be deleted.
        int value = tail.value;
        tail = secondlast;
        tail.next = null; // the next will point towards null, as there's no other node to point to.
        size--;

        return value;
    }

    private Node get(int index){ // this fun() will help us reach the index value.
        Node node = head;
        for(int i=1; i<index; i++){
            node = node.next;
        }

        return node;
    }

    // deleting a node at any index of the list.
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }

        if(index == size-1){ 
            return deleteLast();
        }

        Node prev = get(index - 1);
        int value = prev.next.value;
        prev.next = prev.next.next;
        size--;
        return value;
    }

    // finding a specific value in the list.
    public Node find(int val){
        Node node = head;
        while(node != null){
            if(node.value == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display() {
        Node temp = head; // pointing the temp as same as head so that head does'nt change, if head changes the whole structure of the list changes.

        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next; // When adding a new node, I can use the second constructor to directly connect it to the old list by passing the head as its next. This way, it points to the rest of the list right away.
        }
        System.out.print("END");
    }
    
    private class Node{
        private int value;
        private Node next;

        // the first constructor is to create only one node with addressing the next as null internally. 
        public Node(int value){
            this.value = value;
        }

        // the second constructor is to create a node and address the second node/the next node. 
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}