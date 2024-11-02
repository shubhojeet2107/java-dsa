package recursion;

public class steps {
    public static void main(String[] args) {
        int num = 123;
        System.out.print(numberOfSteps2(num));
    }

    // Brute Force Approach
    public static int numberOfSteps1(int num) {
        int count = 0;

        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                num = num - 1;
                count++;
                if (num == 0) {
                    break;
                }
                num = num / 2;
            }
            count++;
        }
        return count;
    }

    // Recursion 
    public static int numberOfSteps2(int num) {
        return function(num, 0);
    }

    public static int function(int num, int count){
        if(num == 0){
            return count;
        }
        if(num % 2 == 0){
            return function(num/2, ++count);
        }
        return function(num-1, ++count);
    }
}
