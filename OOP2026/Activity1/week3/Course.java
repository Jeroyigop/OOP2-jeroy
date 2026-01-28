public class Course {
    public static void main(String[] args) {
        String courseCode;
        String courseTitle;
        Student [] enrolledStudents;
        int enrollmentCount = 0;
        static String schoolName = "My University";
        

        public Course(){}
        public Course(String courseCode, String courseTitle, int creditHours, String instructorName){
            courseCode = courseCode;
            courseTitle = courseTitle;
            enrolledStudents = new Student[50]; /
            enrollmentCount = 0;

            public void enrolledStudents(Student student){
                if(enrollmentCount < enrolledStudents.length){
                    enrolledStudents[enrollmentCount] = student;
                    enrollmentCount++;
                } else {
                    System.out.println("Enrollment full. Cannot add more students.");
                }
            }
            public void displayCourseInfo(){
                System.out.println("Course Code: " + courseCode);
                System.out.println("Course Title: " + courseTitle);
                System.out.println("School Name: " + schoolName);
                System.out.println("Enrolled Students: " + enrollmentCount);

        }
        public static String getSchoolName(){
            return schoolName;
        }
    }
}