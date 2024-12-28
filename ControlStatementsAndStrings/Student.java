package ControlStatementsAndStrings;


import java.util.Scanner;

public class Student {

    String firstName ;
    String lastName  ;
    int age ;

    Student( String firstName , String lastName , int age){
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.age = age ;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                '}';
    };


    public static void main( String [] args ){

        Scanner myScanner = new Scanner( System.in ) ;
        Student myStudent = new Student("Abhishek" , "Kanade" , 22) ;
        System.out.println((myStudent).toString());

    }
}
