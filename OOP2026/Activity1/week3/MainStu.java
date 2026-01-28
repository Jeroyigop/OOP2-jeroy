package OOP2026.Activity1.week3;

public class MainStu {
    public static void main(String[] args) {
       
        Student student1 = new Student(1001, "John", "A.", "Doe", "Male", "john.doe@example.com");
        Student student2 = new Student(1002, "Jane", "B.", "Smith", "Female", "jane.smith@example.com");

        
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();

        System.out.println();
        Student.displayTotalInfo();
    }
}