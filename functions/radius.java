// Write a function that takes in the radius as input and returns the circumference of a circle.

import java.util.Scanner;
public class radius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        calculateradius(sc);
        sc.close();
    }

    public static void calculateradius(Scanner sc) {
        System.out.print("Enter the radius: ");
        double radius = sc.nextDouble();
        double pi = 3.14;
        double circumference = (2*pi*radius*radius);
        System.out.println(circumference);
        calculateradius(sc);
    }
}
