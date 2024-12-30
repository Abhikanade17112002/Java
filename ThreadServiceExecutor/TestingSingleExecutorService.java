package ThreadServiceExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingSingleExecutorService {
    public static void main(String[] args) throws InterruptedException {
      ExecutorService service =  Executors.newSingleThreadExecutor() ;
      PrintTask t1  = new PrintTask('*') ;
        PrintTask t3  = new PrintTask('#') ;
        PrintTask t2  = new PrintTask('%') ;

      service.submit(t1);
      service.submit(t2);
      service.submit(t3);

      service.shutdown();

      if(!service.awaitTermination(10, TimeUnit.SECONDS)){
          service.shutdownNow() ;
          System.out.println("FORCEFULL SHUT DOWN ");

      }

    }
}
