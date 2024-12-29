package MultiThreadingAndThreadExecutor;

public class ProgrammeTimeCounter {
    public static void main( String [] args ){

        double startTime = System.currentTimeMillis() ;
         //       First Task

        System.out.println("Entering The First Task : ");
        System.out.println();
        for (int i = 1; i <= 1000  ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println();

        System.out.println("Completed The First Task : ");

        //       Second Task

        System.out.println("Entering The Second Task : ");
        System.out.println();
        for (int i = 1; i <= 1000  ; i++) {
            System.out.printf("%d& ",i);
        }
        System.out.println();

        System.out.println("Completed The Second Task : ");

        //       Third Task

        System.out.println("Entering The Third Task : ");
        System.out.println();
        for (int i = 1; i <= 1000  ; i++) {
            System.out.printf("%d= ",i);
        }
        System.out.println();
        System.out.println("Completed The Third Task : ");


        double endTime = System.currentTimeMillis() ;


        System.out.println("The Total Execution Time Of The Programme Is : "+(endTime-startTime));


    }
}
