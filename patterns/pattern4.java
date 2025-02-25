// Print Pattern: Write a program to print the following pattern:
   
// 1
// 1 2
// 1 2 3
// 1 2 3 4
// 1 2 3 4 5


package patterns;


public class pattern4 {
    public static void main(String[] args){
        pattern(5);
    }

    static void pattern(int num){
        for(int i=1; i<=num; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
