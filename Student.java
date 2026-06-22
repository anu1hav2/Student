public class Student {

    int rollNo;
    String name;
    int marks;

    // Constructor
    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    // Display student details
    void display() {
        System.out.println("Roll No : " + rollNo);
        System.out.println("Name    : " + name);
        System.out.println("Marks   : " + marks);
        System.out.println("Result  : " + getResult());
        System.out.println("---------------------------");
    }

    // Check pass/fail
    String getResult() {
        if (marks >= 35) {
            return "Pass";
        } else {
            return "Fail";
        }
    }

    // Main method
    public static void main(String[] args) {

        Student s1 = new Student(1, "Rahul", 78);
        Student s2 = new Student(2, "Priya", 92);
        Student s3 = new Student(3, "Amit", 30);

        s1.display();
        s2.display();
        s3.display();
    }
}