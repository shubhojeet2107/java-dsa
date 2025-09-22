package oops.generics;

import java.util.Arrays;

public class CustomGenArrayList<T> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArrayList(){
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(int num){
        if (isFull()){
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in the new array
        for(int i=0; i<data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[size--]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size() {
        return size;
    }

    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList {" +
                "data = " + Arrays.toString(data) +
                ", size = " + size +
                "}";
    }

    public static void main(String[] args){
        CustomArrayList list = new CustomArrayList();
        for(int i=1; i<=14; i++){
            list.add(2*i);
        }

        System.out.print(list);
    }
}
