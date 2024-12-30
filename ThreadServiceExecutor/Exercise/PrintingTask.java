package ThreadServiceExecutor.Exercise;

import ThreadServiceExecutor.PrintTask;

public class PrintingTask implements  Runnable{
    private final int myInteger ;

    public PrintingTask( int myInteger ){
        this.myInteger = myInteger ;
    }
    @Override
    public void run() {
        System.out.println("I Am Inside The Run Methode With Thread : " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(Thread.currentThread().getName() + "Prints : " + this.myInteger);

        System.out.println(Thread.currentThread().getName() + "Completes Printing\n");

    }
}
