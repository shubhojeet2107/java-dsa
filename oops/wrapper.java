package oops;

public class wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swap(a, b);
        System.out.println(a + " " + b);

        // final int BONUS = 3;
        // BONUS = 4;

        // final Keyword:
        // A field can be declared as final. Doing so prevents its contents from being modified, making it, essentially, a constant. This means that you must initialize a final field when it is declared. 
        // final keyword is used to set the value to a constant and it cannot be modified later.

        // Unfortunately, final guarantees immutability only when instance variables are primitive types, not reference types.If an instance variable of a reference type has the final modifier, the value of that instance variable (the reference to an object) will never change—it will always refer to the same object—but the value of the object itself can change.

        final Student shubh = new Student();
        shubh.name = "karthik";
        System.out.println(shubh.name);
        // shubh.name = other object  'X' This won't work.
    }

    static void swap(int first, int second) {
        int temp = first;
        first = second;
        second = temp;
    }
}
