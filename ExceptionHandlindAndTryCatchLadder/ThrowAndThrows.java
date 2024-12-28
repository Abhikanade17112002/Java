package ExceptionHandlindAndTryCatchLadder;

import java.util.Scanner ;

public class ThrowAndThrows {


    public static void checkUserName(  String Name  ) throws TempreatureException {

        if( Name.contains("-") ){
            throw new TempreatureException() ;
        }

        System.out.println("Youre Name Is : " +  Name  );
    }
    public static void main( String [] args ){

        Scanner myScanner = new Scanner( System.in ) ;

        System.out.print("Enter Youre Full Name : ");
        String Name = myScanner.nextLine() ;

        try{
         checkUserName(Name);
        }catch (Exception e){
            System.out.println("Exception Occured : " + e ) ;

        }
        finally {
            System.out.println("I Am In Finally Block ");
        }
    }

}






