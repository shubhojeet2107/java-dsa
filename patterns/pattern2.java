// Print Pattern: Write a program to print the following pattern:

// *
// * *
// * * *
// * * * *
// * * * * *


package patterns;

public class pattern2 {
    public static void main(String[] args){
        pattern(5);
    }

    static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
