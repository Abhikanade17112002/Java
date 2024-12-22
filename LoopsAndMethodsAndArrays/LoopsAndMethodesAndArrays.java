package LoopsAndMethodsAndArrays;

import java.util.Scanner;

public class LoopsAndMethodesAndArrays {
    public static void main( String [] args ){
//        printMultiplicativeTable() ;
        sumOfOdds() ;
    }

    public static void printMultiplicativeTable() {
        Scanner myScanner = new Scanner(System.in) ;
        System.out.print("Enter The Number To Print The Table Of : ");
        int number = myScanner.nextInt() ;
        System.out.println();
        for( int i = 0 ; i <= 10 ; i++ ){
            System.out.println(number + " x "  + i + " = " + (i*number));
        }
        System.out.println();
        System.out.println();

    }

    public static void sumOfOdds(){
        Scanner myScanner = new Scanner(System.in) ;
        System.out.print("Enter The Number : ");
        int number = myScanner.nextInt() ;
        int Sum  = 0 ;
        for (int i = 1; i <= number ; i++) {

            if( (i&1) == 1){
               Sum += i ;
            }

        }


        System.out.println("Sum  = "+Sum);
    }
}
