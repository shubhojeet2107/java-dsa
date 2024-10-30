package maths;

public class prime {
    public static void main(String[] args){
        int num = 37;
        System.out.print(isPrime(num));
    }

    public static boolean isPrime(int num){
        if(num <= 1){
            return false;
        }

        int count = 2;
        while(count*count <= num){
            if(num % count == 0){
                return false;
            }
            count++;
        }
        return true;
    }
}
