package recursion.questions.easy;

public class sumOfdigits {
    public static void main(String[] args){
        int num = 45632;
        System.out.println(recursive(num, 0));
    }

    public static int recursive(int num, int ans){
        if(num == 0){
            return ans;
        }

        ans += num%10;
        num = num/10;
        return recursive(num, ans);
    }
}
