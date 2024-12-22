package basics;

import java.lang.* ;

public class Exercise {
     public  static  void  main( String [] args ){

         System.out.println("Exercise1");
         printPattern1();
         System.out.println();
         printPattern2();
         System.out.println();
         printPattern3();

     }

     public  static void printPattern1( ){
         for(int i = 0; i < 5; i++) {

             for (int j = 0 ; j < i ; j++ ){

                 System.out.print(" *");
             }

             System.out.println();

         }
     }
    public  static void printPattern2( ){
        for(int i = 0; i < 5; i++) {

            for (int j = 5 - i  ; j > 0; j-- ){

                System.out.print(" *");
            }

            System.out.println();

        }
    }
    public  static void printPattern3( ){
        for(int i = 1; i <= 5; i++) {

            for( int j = ( 5 - i ); j > 0 ; j-- ){
                System.out.print(" ");
            }
            for( int j = i ; j > 0 ; j-- ){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
