package ExceptionHandlindAndTryCatchLadder;


import java.util.Scanner ;
public class TryCatch {
    public static void main( String [] args ){
        Scanner myScanner = new Scanner(System.in) ;

        try{
            System.out.println("Enter Two Integers : ");
            int first = myScanner.nextInt() ;
            int second = myScanner.nextInt() ;


            System.out.println("Performing Division : ");
            double result = first/second ;

            System.out.println("Result : " + result  );
        } catch (ArithmeticException e) {
            System.out.println("Exception Occured : " + e);

        }
    }
}
