package recursion.basics;

public class factorial {
    public static void main(String[] ans){
        System.out.print(fun(0));
    }

    static int fun(int num){
        if(num <= 1){
            return 1;
        }
        return num * fun(num-1);
    }
}
