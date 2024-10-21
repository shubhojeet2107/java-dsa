package strings;

public class palindrome {
    public static void main(String[] args){
        String str = "abccba";
        System.out.println(isPalindrome(str));
    }

    private static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}
