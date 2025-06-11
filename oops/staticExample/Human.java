
// Creating a class template of Human with some properties of each human being.
public class Human {
    int age;
    String name;
    int salary;
    boolean married;

    // basically the static is used when it is common to all objects of the class, rather than only depending upon the object.
    static long population;  // Static method in Java is a method which belongs to the class and not to the object.

    static void message() {
        System.out.println("Hello world");
        // System.out.println(this.age);   // cant use this over here
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;  // A static method can be accessed directly by the class name and doesn’t need any object. A static method cannot refer to "this" or "super" keywords in anyway.
    }
}