/* Create a parent class called "Person" with attributes such as name, age, and a method called "speak". Create a child class called "Student" that inherits from Person and has an 
   additional attribute called "grade" and a method called "study". Create an object of the Student class and call both the "speak" and "study" methods. */
package prg;
class Person {
    String name;
    int age;

    Person(String name, int age) // // Constructor to initialize name and age of the person
    {
        this.name = name;
        this.age = age;
    }

    void speak() {
        System.out.println("Hello, my name is " + name + " and I am " + age + " years old.");
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age); 
        this.grade = grade;
    }

    void study() {
        System.out.println("I am studying in grade " + grade + ".");
    }

    public static void main(String[] args) {
        Student student = new Student("Alice", 15, "10th");

        student.speak(); // Calls the speak() method inherited from Person
        student.study(); // Calls the study() method specific to Student
    }
}
    

/* Output
Hello, my name is Alice and I am 15 years old.
I am studying in grade 10th. */
