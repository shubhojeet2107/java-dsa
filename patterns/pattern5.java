// Print Pattern: Write a program to print the following pattern:

// *
// * *
// * * *
// * * * *
// * * * * *
// * * * *
// * * *
// * *
// *



package patterns;

public class pattern5 {
    public static void main(String[] args){
        pattern(9);
    }
    static void pattern(int num){
        for(int i=1; i<=5; i++){
            for(int j=5; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
