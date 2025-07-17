package linkedlist;

// import java.lang.classfile.components.ClassPrinter.ListNode;

public class questions {

    private Node head;
    private Node tail;
    private Node next;
    private int size;

    public questions(){
        this.size = 0;
    }
    
    public class Node{
        private int value;
        private Node next;

        private Node(int value){
            this.value = value;
        }

        private Node(int val, Node next){
            this.value = val;
            this.next = next;
        }
    }

    public void display(){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    // Q1) Insertion of an element in a singly linked list with recursion.
    public void insertRec(int value, int index){
        head = insertRec(value, index, head);
    }

    private Node insertRec(int value, int index, Node node){
        if(index == 0){
            Node temp = new Node(value, node);
            size++;
            return temp;
        }

        node.next = insertRec(value, index-1, node.next);
        return node;
    }

    // Q2) Leetcode 83. Remove Duplicates from Sorted List
    public Node deleteDuplicates(Node head) {
        if(head == null){
            return head;
        }

        Node temp = head;
        while(temp.next != null){
            if(temp.value == temp.next.value){
                temp.next = temp.next.next;
            }else{
                temp = temp.next;
            }
        }
        return head;
    }

    // Q3) Leetcode 21. Merge Two Sorted Lists
    public Node mergeTwoLists(Node list1, Node list2){
        Node dummy = new Node(-1);
        Node current = dummy;

        while(list1 != null && list2 != null){
            if(list1.value < list2.value){
                current.next = list1;
                list1 = list1.next;
            }else{
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        if(list1 != null){
            current.next = list1;
        }else{
            current.next = list2;
        }
        return dummy.next;
    }

    // Q4) Leetcode 141. Linked list Cycle
    public boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                return true;
            }
        }
        return false;
    }

    // Q5) Follow-up for above: find the length of the cycle.
    public int LengthOfCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast){
                Node temp = slow;
                int length = 0;

                do { 
                    temp = temp.next;
                    length++;
                } while (temp != slow);

                return length;
            }
        }
        return 0;
    }

    // Q6) Leetcode 142. Linked list Cycle II
    public Node detectCycle(Node head) {
        Node fast = head;
        Node slow = head;
        int length = 0;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(slow == fast);
            length = LengthOfCycle(slow);
            break;
        }

        if(length == 0){
            return null;
        }

        Node p1 = head;
        Node p2 = head;

        while(length > 0){
            slow = slow.next;
            length--;
        }

        while(p1 != p2){
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    // Q7) Leetcode 202. Happy Numbers
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do { 
            slow = square(slow);
            fast = square(square(fast)); 
        } while (slow != fast);

        if (slow == 1){
            return true;
        }
        return false;
    }

    private int square(int number){
        int ans = 0;
        while(number > 0){
            int rem = number%10;
            ans += rem*rem;
            number = number/10;
        }
        return ans;
    }

    // Q8) Leetcode 876. Middle of the linked list
    public Node middleNode(Node head){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Q9) Leetcode 148. Sort Linked List

    // Using bubble sort technique recursively
    public Node sortList(Node head) {
        if(head == null || head.next == null){
            return head;
        }
        this.head = head;
        this.tail = getTail(head);
        int size = getSize(head);
        sortList(0, size-1);

        return this.head;
    }

    private int getSize(Node head) { // this fun() will help to know the size of the list.
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    private Node getTail(Node node) { // this fun() will help us reach the tail of the list.
        if (node == null){
            return null;
        }
        while (node.next != null) {
            node = node.next;
        }
        return node;
    }

    private Node get(int index){ // this fun() will help us reach the index value.
        Node node = head; 
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }

    private void sortList(int start, int end){
        if(end == 0){
            return;
        }

        if(start < end){
            Node first = get(start);
            Node second = get(start+1);

            if(first.value > second.value){
                // swap

                // case 1: first = head
                if(first == head){
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                // case 2: second = tail
                else if (second == tail) {
                    Node prev = get(start - 1);
                    prev.next = second;
                    second.next = first;
                    first.next = null;
                    tail = first;
                }
                // case 3: anywhere in the middle
                else{
                    Node prev = get(start - 1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            sortList(start+1, end);
        }else{
            sortList(0, end-1);
        }
    }

    // Q10) Reverse the Linked List (recursively)
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }

        reverse(node.next);
        node.next = tail;
        tail = node;
        tail.next = null;
    }

    // Q11) in-place reversal of linked list (iterative)
    public Node reverseList(Node head) {
        if(head == null){
            return head;
        }

        Node pres = head;
        Node prev = null;
        Node next = pres.next;

        while(pres != null){
            pres.next = prev;
            prev = pres;
            pres = next;
            if(next != null){
                next = next.next;
            }
        }
        return prev;
    }

    // Q12) reverse a linked list II
    public Node reverseBetween(Node head, int left, int right) {
        if(left == right){
            return head;
        }

        // skip the n-1 nodes
        Node current = head;
        Node prev = null;

        for(int i=0; current != null && i<left-1; i++){
            prev = current;
            current = current.next;
        }

        Node last = prev;
        Node newEnd = current;
         
        // Reverse the list
        Node next = current.next;
        for(int i=0; current != null && i<(right-left)+1; i++){
            current.next = prev;
            prev = current;
            current = next;
            if(next != null){
                next = next.next;
            }
        }

        if(last != null){
            last.next = prev;
        }else{
            head = prev;
        }

        newEnd.next = current;
        return head;
    }
}
