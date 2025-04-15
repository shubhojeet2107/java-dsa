//classes and objects working in java

package oops;

// import java.util.Arrays;

public class lecture1 {
    public static void main(String[] args){

        //classes are declared by starting off with capital letters whereas, primitives and objects are not.

        // int[] marks = new int[5]; //This is a primitive, storing objects in their reference variables. 
        // Integer[] age = new Integer[5]; //This is a wrapper class, storing objects in their reference variables.
        // String[] names = new String[5]; //This is class, storing objects in their reference variables.

        //we are creating object of our own class name Student and trying to print out the properties assigned to that class.
        Student kunal = new Student(); //kunal here is reference variable.
        System.out.println(kunal.rno);
        System.out.println(kunal.name);
        System.out.println(kunal.marks);

        System.out.println();

        Student rahul = new Student();
        System.out.println(rahul.rno);
        System.out.println(rahul.name);
        System.out.println(rahul.marks);

        System.out.println();

        Student akhil = new Student(21, "Akhil", 79.4f);
        System.out.println(akhil.rno);
        System.out.println(akhil.name);
        System.out.println(akhil.marks);

        System.out.println();

        Student akshay = new Student();
        akshay.gretting();
        akshay.changename("Prakash");
        akshay.gretting();
    }
}

class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 13;
        this.name = "Ayush";
        this.marks = 73.5f;
    }

    Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }

    void gretting(){
        System.out.println("hello " +this.name);
    }

    void changename(String name){
        this.name = name;
    }
}