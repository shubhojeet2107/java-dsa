public class evenodd {
    public static void main(String[] args) {
        int num = 67;
        System.out.print(isOdd(num));
    }

    private static boolean isOdd(int num) {
        return (num & 1) == 1;
    }
}
