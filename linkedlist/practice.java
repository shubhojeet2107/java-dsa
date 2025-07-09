package linkedlist;

public class practice {

    private Node head;
    private Node tail;

    private int size;

    public practice() {
        this.size = 0;
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        // node.head = 
    }
    
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }
    }
}
