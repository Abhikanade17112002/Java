package ThreadServiceExecutor.Exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingPrintingTask {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3) ;

        for (int i = 1; i <= 10  ; i++) {
            PrintingTask newTask = new PrintingTask(i) ;
            service.submit(newTask) ;
        }
        service.shutdown();

        if( !service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("FORCFULL SHUT DOWN ");
            service.shutdownNow() ;
        }
    }
}
