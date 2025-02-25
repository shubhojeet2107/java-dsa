// Print Pattern: Write a program to print the following pattern:

// *    *
// **   **
// ***  ***
// **** ****
// **********

package patterns;

public class asked_in_amazon {
    public static void main(String[] args){
        pattern();
    }

    static void pattern(){
        for(int i=1; i<=5; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            for(int k=5; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
