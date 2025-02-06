package recursion.basics;

public class fibonacci {
    public static void main (String[] args){
        System.out.print(fibo(3));
    }

    static int fibo(int n){
        if(n < 2){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
