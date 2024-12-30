package MultiThreadingAndThreadExecutor.Exercise;

public class AnounccerThread extends  Thread{
    private String message ;

    public void run(){
        System.out.println(" I Am Inside The " + Thread.currentThread().getName() + " Thread , And Starting Execution ");

        System.out.println();
        System.out.println();
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(" "+ i +" )"+" Hello From "+ Thread.currentThread().getName()+" Thread , And I Am  Under Execution ");
        }
        System.out.println();
        System.out.println();
        System.out.println(" I Am Inside The " + Thread.currentThread().getName() + " Thread , And Completed Execution ");
    }

    public AnounccerThread( String message ){
        this.message = message ;
    }

}
