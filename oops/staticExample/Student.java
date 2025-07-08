public class Student {
    
    String name;
    int rollNo = 25;
    static int studentCount;

    static void printTotalStudents(){
        System.out.print(studentCount);
    }

    // Constructor:
    Student() {
        studentCount++;
        rollNo += studentCount;
    }


    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        System.out.println("rollNo of student 1 = " +student1.rollNo);
        System.out.println("rollNo of student 2 = " +student2.rollNo);
        System.out.println("rollNo of student 3 = " +student3.rollNo);

        printTotalStudents();
    }
}
