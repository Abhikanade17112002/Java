package MultiThreadingAndThreadExecutor;

public class RunnableTask implements Runnable{
    @Override
    public void run() {

        System.out.println("Starting The First Task : " + this.myString );

        for( int i = 1 ; i <= 1000 ; i++ ){
            System.out.printf("%d* :- ",i);
        }

        System.out.println("Ending The First Task : " + Thread.currentThread().getName());
    }

    private final String myString ;

    public RunnableTask( String myString ){
        this.myString  = myString ;
    }
}
