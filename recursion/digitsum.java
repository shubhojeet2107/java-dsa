package recursion;

public class digitsum {
    public static void main(String[] args){
        System.out.println(sum(1342));
    }

    static int sum(int num){
        if(num == 0){
            return 0;
        }
        return (num%10) + sum(num/10);
    }
}
