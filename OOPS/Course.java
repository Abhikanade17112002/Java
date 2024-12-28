package OOPS;

public class Course {
    String courseName ;
    int enrolledStudents ;
    static int maxCapacity ;


    public static void setMaxCapacity( int _maxCapacity ){
        maxCapacity = _maxCapacity ;

    }
    public void enrollStudent( String studentName  ){
        System.out.println("Student Enrolled : "+studentName);
    }

    public void unEnrolledStudent( String studentName ){
        System.out.println("Student UnEnrolled : "+studentName);
    }

}
