package recursion;

public class practice {
    public static void main(String[] args){
        System.out.print(fun(5));
    }

    public static int fun(int num){
        if(num == 1){
            return 1;
        }

        return num * fun(num-1);
    }
}
