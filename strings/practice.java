package strings;

public class practice {
    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a, b));
    }

    public static String addBinary(String a, String b) {
        // String ans = " ";
        int a1 = Integer.parseInt(a);
        int b1 = Integer.parseInt(b);
        int ans = a1+b1;
        String ans1 = Integer.toString(ans);
        System.out.println(Integer.toBinaryString(ans));
        return ans1;
    }
}