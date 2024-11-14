public class setbit {
    public static void main(String[] args){
        System.out.println(rightshift(8, 1));
        System.out.println(leftshift(8, 1));
    }

    public static int rightshift(int num, int i){
        return ((num >> i-1) | 1);
    }

    public static int leftshift(int num, int i){
        return (num | (1 << i-1));
    }
}
