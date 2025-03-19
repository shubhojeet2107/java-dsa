package oops;

public class wrapper {
    public static void main(String[] args){
        int a = 10; int b = 20;
        swap(a, b);
        System.out.println(a+ " " +b);
    }

    static void swap(int first, int second){
        int temp = first;
        first = second;
        second = temp;
    }
}
