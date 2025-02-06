// Recursion to print number 1 to num and from num to 1;

package recursion.basics;

public class problem1 {
    public static void main(String[] args){
        fun(5);
        System.out.println();
        funrev(5);
    }

    static void fun(int num){
        if(num == 0){
            return;
        }
        System.out.println(num);
        fun(num-1);
    }

    static void funrev(int num){
        if(num == 0){
            return;
        }
        funrev(num-1);
        System.out.println(num);
    }
}
