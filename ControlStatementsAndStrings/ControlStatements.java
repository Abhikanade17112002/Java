package ControlStatementsAndStrings;

import java.util.Scanner;
import java.lang.* ;

public class ControlStatements {
    public static void main(String[] args) {
//     ternaryOperator();
        switchStatement(3);



    }


    public static void ternaryOperator(){
        // Ternary Operator
        Scanner myScanner = new Scanner(System.in)  ;

        System.out.print("Enter Number 1 : ");
        int Number1 = myScanner.nextInt() ;



        System.out.print("Enter Number 2 : ");
        int Number2 = myScanner.nextInt() ;


        int greaterNumber = Number1 > Number2 ? Number1 : Number2 ;


        System.out.println("The Greater Of The Two Numbers Is " + greaterNumber);
    }

    public static  void switchStatement( int day ){
        switch ( day ){
            case 1:
                System.out.println("Monday");
                break ;
            case 2:
                System.out.println("Tuesday");
                break ;
            case 3:
                System.out.println("Wednesday");
                break ;
            default:
                System.out.println("Invalid Day Encountered");
        } ;
    }
}
