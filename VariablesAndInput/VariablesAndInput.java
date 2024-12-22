package VariablesAndInput;

import java.util.Scanner ;
public class VariablesAndInput {
    public static void main(String[] args) {
//        printName();
        addNumbers();
    }


    public static void printName( ){
        Scanner myScanner = new Scanner(System.in) ;

        System.out.print("User , Please Enter Youre Name :- ");
        String myName = myScanner.nextLine() ;
        System.out.println(" Good Morning , " + myName);
    }

    public static void addNumbers( ){
        Scanner myScanner = new Scanner(System.in) ;

        System.out.print("User , Please Enter First Number");
        int num1 = myScanner.nextInt() ;
        System.out.print("\nUser , Please Enter Second Number");
        int num2 = myScanner.nextInt() ;
        int Sum = num1 + num2 ;
        System.out.println("\n Good Morning , Te Sum Of Two Numbers Is "+Sum);
    }
}
