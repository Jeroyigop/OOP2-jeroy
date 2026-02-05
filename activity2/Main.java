public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(2510792, "Nathaniel", "Tan", "Gacayan", "Male", "nathaniel.gacayan@lorma.edu");
        Student s2 = new Student(2511004, "John Carlo", "Oliveros", "Valdez", "Female", "johncarlo.valdez@lorma.edu");
        Student s3 = new Student(1234567, "Joel", "Carlo", "Yulo", "Male", "joelcarlo.yulo@lorma.edu");

        Course course1 = new Course("CS101", "Introduction To Programming");

        course1.enrollStudent(s1);
        course1.enrollStudent(s2);
        course1.enrollStudent(s3);
        course1.displayCourseInfo();

    }
}