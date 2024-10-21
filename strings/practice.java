package strings;

public class practice {
    public static void main(String[] args){
        String str = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        if(str.length() == 0){
            return true;
        }

        str = str.toLowerCase();
        str = str.replaceAll("[^a-z0-9]", "");

        int start = 0;
        int end = str.length()-1;
        while(start < end){
            if(str.charAt(start) != str.charAt(end)){
                return false;
            }else{
                start++;
                end--;
            }
        }
        return true;
    }
}