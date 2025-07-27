package stack;

public class customStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public customStack(){
        this(DEFAULT_SIZE);
    }

    public customStack(int size){
        this.data = new int[size];
    }

    public boolean push(int value){
        if(isFull()){
            System.out.println("Stack is Full");
            return false;
        }
        ptr++;
        data[ptr] = value;
        return true;
    }

    public int pop() throws Exception{
        if(isEmpty()){
            throw new Exception("Cannot pop from empty Stack");
        }
        int removed = data[ptr];
        ptr--;
        return removed;
    }

    public boolean isFull(){
        return ptr == data.length-1; // ptr is at last index.
        /*
        if(ptr == data.length-1){
            return true;
        }
        return false;
         */
    }

    public boolean isEmpty(){
        return ptr == -1; // ptr is empty. 
        /*
        if(ptr == -1){
            return true;
        }
        return false;
         */
    }
}
