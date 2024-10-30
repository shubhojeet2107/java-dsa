// Given two binary strings a and b, return their sum as a binary string.

public class AddBinaryStrings {
    public static void main(String[] args){
        String a = "1010";
        String b = "1011";
        System.out.println(addBinary(a,b));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i>=0 || j>=0){
            int sum = carry;

            if(i >= 0){
                sum = sum + a.charAt(i)-'0';
                i--;
            }

            if(j >= 0){
                sum = sum + b.charAt(j)-'0';
                j--;
            }

            // Append the sum modulo 2 (either 0 or 1) to the result
            result.append(sum%2);
            // Calculate the carry for the next position
            carry = sum/2;
        }

        // If there's a carry left, append it
        if(carry != 0){
            result.append(carry);
        }
        return result.reverse().toString();
    }
}