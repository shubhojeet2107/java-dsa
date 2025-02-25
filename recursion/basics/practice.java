package recursion.basics;

// import java.util.Scanner;
public class practice {
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        int number = 14;
        System.out.println();
    }

    public int numberOfSteps(int num) {
        return ans(num, 0);
    }

    public int ans(int num, int count){
        if(num == 0){
            return count;
        }

        if(num%2 == 0){
            return ans(num/2, count++);
        }else{
            return ans(num-1, count++);
        }
    }
}

