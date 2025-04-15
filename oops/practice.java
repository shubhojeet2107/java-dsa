package oops;

public class practice {
    public static void main(String[] args){

        Student shubh = new Student();
        System.out.println(shubh.rno);
        System.out.println(shubh.name);
        System.out.println(shubh.marks);

        Student ritik = new Student(21, "ritik", 78.9f);
        System.out.println(ritik.rno);
        System.out.println(ritik.name);
        System.out.println(ritik.marks);
    }

static class Student{
    int rno;
    String name;
    float marks;

    Student(){
        this.rno = 13;
        this.name = "Shubh";
        this.marks = 67f;
    }

    Student(int roll, String name, float marks){
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}   

}
