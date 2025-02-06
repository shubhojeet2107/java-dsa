package recursion.basics;

public class palindrome {
    public static void main (String[] args){
        System.out.println(palin(1234321));
    }

    static boolean palin(int num){
        return num == reverse(num);
    }

    static int reverse(int num){
        int digits = (int)(Math.log10(num))+1;
        return helper(num, digits);
    }

    static int helper(int num, int digits){
        if(num % 10 == num){
            return num;
        }
        int rem = num % 10;
        return rem * (int)(Math.pow(10, digits-1)) + helper(num/10, digits-1);
    }
}
