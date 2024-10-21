// Reverse the elements of an array.

package java_arrays;

import java.util.Scanner;
public class reverseelememts {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int[] array = {10,20,30,40,50};

        // Output Elements
        for(int i=array.length-1; i>=0; i--){
            System.out.print(array[i]+ " ");
        }
        sc.close();
    }
}
