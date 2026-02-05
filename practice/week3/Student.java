package OOP2026.Activity1.week3;


public class Student {
    public static void main(String[] args){
      
        int studentID;
        String firstName;
        String middleName;
        String lastName;
        String Gender;
        String email;
        static int totalStudents = 0;

        public Student(){}
        public Student(int studentID, String firstName, String middleName, String lastName,String Gender,String email){
            studentID = studentID;
            firstName = firstName;
            middleName = middleName;
            lastName = lastName;
            Gender = Gender;
            email = email;
            totalStudents++;
        }
public void displayStudentInfo(){
    System.out.println("Student ID: " + studentID);
    System.out.println("First Name: " + firstName);
    System.out.println("Middle Name: " + middleName);
    System.out.println("Last Name: " + lastName);
    System.out.println("Gender: " + Gender);
    System.out.println("Email: " + email);
}
public void displayTotalInfo(){
    System.out.println("Total Students: " + totalStudents);
    

    


    
}
