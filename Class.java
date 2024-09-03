/*Create a class named Student with properties like name,age,and studentId.Implement a
 constructor to initialize these properties when a Student object is created.Add methods to
 display student information. */
public class Class {
    private String name;
    private String id;
    private int age;

    public Class(String name, int age, String id) {
        this.name = name;

        this.age = age;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student ID: " + id);
    }

    public static void main(String[] args) {
        Class student = new Class("John Doe", 20, "S12345");

        student.displayInfo();
    }
}
