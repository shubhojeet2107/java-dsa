package recursion;

public class reverse {
    // public static void main(String[] args){
    //     function(12345);
    //     System.out.print(sum);
    // }

    // static int sum = 0;
    // static void function(int num){
    //     if(num == 0){
    //         return;
    //     }
    //     int rem = num%10;
    //     sum = sum * 10 + rem;
    //     function(num/10);
    // }

    static int function2(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num, digits);
    }

    private static int helper(int num, int digits){
        if(num % 10 == num){
            return num;
        }

        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(num/10, digits-1);
    }

    public static void main(String[] args){
        // function2(12345);
        System.out.print(function2(12345));
    }
}
 