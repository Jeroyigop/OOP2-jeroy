
public class Course {
    private String courseCode;
    private String courseTitle;
    private Student[] enrolledStudents;
    private int enrollmentCount = 0;
    private static String schoolName = "My University";

    public Course() {
        this.enrolledStudents = new Student[50];
    }

    public Course(String courseCode, String courseTitle) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.enrolledStudents = new Student[50];
    }

    public void enrollStudent(Student student) {
        if (enrollmentCount < enrolledStudents.length) {
            enrolledStudents[enrollmentCount] = student;
            enrollmentCount++;
        } else {
            System.out.println("Course is full! Cannot enroll " + student.getTotalStudents());
        }
    }

    public void displayCourseInfo() {
        System.out.println("School: " + schoolName);
        System.out.println("Course Code: " + courseCode);
        System.out.println("Course Title: " + courseTitle);
        System.out.println("Enrolled Students:");

        for (int i = 0; i < enrollmentCount; i++) {
            enrolledStudents[i].displayStudentInfo();
        }
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getEnrollmentCount() {
        return enrollmentCount;
    }
}