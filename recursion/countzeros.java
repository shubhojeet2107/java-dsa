package recursion;

public class countzeros {
    public static void main(String[] args) {
        System.out.print(func(1200860));
    }

    public static int func(int num) {
        return helper(num, 0);
    }

    private static int helper(int num, int count) {
        if (num == 0) {
            return count;
        }

        int rem = num % 10;
        if (rem == 0) {
            return helper(num / 10, count + 1);
        }
        return helper(num / 10, count);
    }
}
