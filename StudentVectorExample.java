import java.util.Vector;

class Student {
    int studentId;
    String name;
    int age;

    // Constructor
    public Student(int studentId, String name, int age) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name + ", Age: " + age);
    }
}

public class StudentVectorExample {
    public static void main(String[] args) {
        // Create a Vector to store student objects
        Vector<Student> studentList = new Vector<Student>();

        // Add student details to the vector
        studentList.add(new Student(101, "John Doe", 20));
        studentList.add(new Student(102, "Jane Smith", 22));
        studentList.add(new Student(103, "Robert Brown", 21));
        studentList.add(new Student(104, "Emily White", 23));

        // Print the details of all students
        System.out.println("Student Details:");
        for (Student student : studentList) {
            student.displayDetails();
        }
    }
}

/*
 Output:

Student Details:
Student ID: 101, Name: John Doe, Age: 20
Student ID: 102, Name: Jane Smith, Age: 22
Student ID: 103, Name: Robert Brown, Age: 21
Student ID: 104, Name: Emily White, Age: 23
*/

