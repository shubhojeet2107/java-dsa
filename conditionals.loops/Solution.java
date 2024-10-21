// import java.io.*;
// import java.math.*;
// import java.security.*;
// import java.text.*;
// import java.util.*;
// import java.util.concurrent.*;
// import java.util.function.*;
// import java.util.regex.*;
// import java.util.stream.*;
// import static java.util.stream.Collectors.joining;
// import static java.util.stream.Collectors.toList;



// public class Solution {
//     public static void main(String[] args) throws IOException {
//         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        
//         System.out.print("NUM:");
//         int N = Integer.parseInt(bufferedReader.readLine().trim());

//         if(N%2 != 0){
//             System.out.println("Weird");
//         }
//         if(N%2 == 0 && N>=2 && N<=5){
//             System.out.println("Not Weird");
//         }
//         if(N%2==0 && N>=6 && N<=20){
//             System.out.println("Weird");
//         }
//         if(N%2==0 && N>20){
//             System.out.println("Not Weird");
//         }
    
//         bufferedReader.close();
//     }
// }



import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input from STDIN
        String str1 = sc.next();
        int num1 = sc.nextInt();
        
        String str2 = sc.next();
        int num2 = sc.nextInt();
        
        String str3 = sc.next();
        int num3 = sc.nextInt();
        
        // Print formatted output
        System.out.println("================================");
        System.out.printf("%-15s%03d%n", str1, num1);
        System.out.printf("%-15s%03d%n", str2, num2);
        System.out.printf("%-15s%03d%n", str3, num3);
        System.out.println("================================");
        sc.close();
    }
}
