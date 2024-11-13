public class getbit {
    public static void main(String[] args){
        System.out.println(leftshift(13, 2));
    }
    // Using right shift operator
    public static int rightshift(int num, int i){
        return ((num >> i) & 1);
    }
    // Using left shift operator
    public static int leftshift(int num, int i){
        return ((num &  (1 << i)) != 0 ? 1:0);
    }
}