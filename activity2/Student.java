package activity2;

public class Student {
    int studentId;
    String firstName;
    String middleName;
    String lastName;
    String gender;
    String email;
    static int totalStudents = 0;

    public Student() {
    }

    public Student(int studentId, String firstName, String middleName, String lastName, String gender, String email) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.email = email;
    }

    public void displayStudentInfo() {
        System.out.println("\nStudent Information");
        System.out.println("Student ID: " + this.studentId);
        System.out.println("First Name: " + this.firstName);
        System.out.println("Middle Name: " + this.middleName);
        System.out.println("Last Name: " + this.lastName);
        System.out.println("Gender: " + this.gender);
        System.out.println("Email: " + this.email);

    }

    public static int getTotalStudents() {
        return totalStudents;
    }
}