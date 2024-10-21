// // Make a function to check if a given number n is even or not.

// import java.util.Scanner;
// public class checkeven {
//     public static void main(String[] args){
//         // Scanner sc = new Scanner(System.in);
//         int ans = checkforeven();
//         System.out.print(ans);
//     } 

//     public static int checkforeven() {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int num = sc.nextInt();

//         if(num%2==0){
//             System.out.println("Even");
//         }
//         else {
//             System.out.println("Odd");
//         }
//         // sc.close();
//         return checkforeven();
//     }
// }

import java.util.Scanner;

public class checkeven {
    public static void main(String[] args){
        // Create the Scanner object only once and pass it to the recursive method.
        Scanner sc = new Scanner(System.in); 
        checkforeven(sc);
        sc.close(); // Close the Scanner after the recursion ends.
    }

    public static void checkforeven(Scanner sc) {
        System.out.print("Enter the number (-1 to stop): ");
        int num = sc.nextInt();

        // Add a termination condition to break recursion
        if (num == -1) {
            System.out.println("Exiting...");
            return;
        }

        if (num % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

        // Recursive call
        checkforeven(sc);
    }
}
