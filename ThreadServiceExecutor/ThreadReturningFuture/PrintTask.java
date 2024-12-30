package ThreadServiceExecutor.ThreadReturningFuture;

import java.util.concurrent.Callable;

public class PrintTask implements Callable<String> {
    private final String myName ;

    public PrintTask(String myName){
        this.myName = myName ;
    }
    @Override
    public String call() throws Exception {
        System.out.println(" INSIDE THE CALL METHODE WITH THREAD AND GETTING NAME FROM SERVER : " + Thread.currentThread().getName());
        Thread.sleep(5000);

        return this.myName + " Indian " ;
    }
}
