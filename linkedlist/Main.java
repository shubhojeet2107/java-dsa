package linkedlist;

public class Main {
    public static void main(String[] args){
        LL list = new LL();
        
        list.insertFirst(13);
        list.insertFirst(23);
        list.insertFirst(34);
        list.insertFirst(53);
        list.insertFirst(63);
        list.insertFirst(93);

        // list.insertLast(95);

        // list.insert(34, 21);

        list.insertRec(12, 3);

        list.display();
    }
}
