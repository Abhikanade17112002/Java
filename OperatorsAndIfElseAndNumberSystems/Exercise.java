package OperatorsAndIfElseAndNumberSystems;

import java.util.Scanner ;
import java.lang.* ;

public class Exercise {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in) ;
//        System.out.print("Enter The First Number : ");
//        int a = myScanner.nextInt() ;
//        System.out.print("Enter The Second Number : ");
//        int b = myScanner.nextInt() ;
//        swapTwoNumbers(a,b);

//        System.out.print("Enter Age OF Youre Child : ");
//
//        int age = myScanner.nextInt() ;
//
//        ifElse(age);

        System.out.print("Enter A Number : ");

        int Number = myScanner.nextInt() ;

        evenOrOdd(Number);


    }

    public static void swapTwoNumbers( int a , int b ){
        System.out.println("The Numbers Before Swapping Are " + a + " " + b );
        int temp = a ;
        a = b ;
        b = temp ;
        System.out.println("The Numbers After Swapping Are " + a + " " + b );

    }
    public static void ifElse( int age ){
        if( age < 18 && age >= 10 ){
            System.out.println("You Are An Teenager");
        }
        else if ( age >= 18 ){
            System.out.println("You Are An Adult");
        }
        else{
            System.out.println("You Are Too Small To Learn Coding ");
        }
    }


    public static void evenOrOdd( int Number ){
        if( (Number & 1) == 1 ){
            System.out.println("ODD Number ");
        }
        else{
            System.out.println("EVEN Number");
        }
    }
}
