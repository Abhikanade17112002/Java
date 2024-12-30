package ThreadServiceExecutor.ThreadReturningFuture;

import java.util.concurrent.*;

public class TestingFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1) ;
        PrintTask t1 = new PrintTask("Abhishek") ;
        PrintTask t2 = new PrintTask("Suman") ;
        PrintTask t3 = new PrintTask("Rangnath") ;
        PrintTask t4 = new PrintTask("Kanade") ;

        Future<String> myName1 = service.submit(t1) ;
        Future<String> myName2 = service.submit(t2) ;
        Future<String> myName3 = service.submit(t3) ;
        Future<String> myName4 = service.submit(t4) ;


        System.out.println(myName1.get());
        System.out.println(myName2.get());
        System.out.println(myName3.get());
        System.out.println(myName4.get());
        service.shutdown();

        if(!service.awaitTermination(5, TimeUnit.SECONDS)){
            service.shutdownNow() ;
            System.out.println("FORCEFULL SHUT DOWN ");

        }




    }
}
