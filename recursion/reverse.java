package recursion;

public class reverse {
    public static void main(String[] args){
        function(12345);
        System.out.print(sum);
    }

    static int sum = 0;
    static void function(int num){
        if(num == 0){
            return;
        }
        int rem = num%10;
        sum = sum * 10 + rem;
        function(num/10);
    }
}
 