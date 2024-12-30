package ThreadServiceExecutor.Exercise;

import java.util.concurrent.*;

public class TestingFactorial {
    public static void main(String[] args) throws InterruptedException , ExecutionException {
        ExecutorService service = Executors.newFixedThreadPool(2) ;
        CalculateFactorialUsingCallable t1 = new CalculateFactorialUsingCallable(5) ;
        CalculateFactorialUsingCallable t2 = new CalculateFactorialUsingCallable(6) ;
        CalculateFactorialUsingCallable t3 = new CalculateFactorialUsingCallable(8) ;
        CalculateFactorialUsingCallable t4 = new CalculateFactorialUsingCallable(4) ;
        CalculateFactorialUsingCallable t5 = new CalculateFactorialUsingCallable(9) ;
        CalculateFactorialUsingCallable t6 = new CalculateFactorialUsingCallable(10) ;

        Future<Integer> result1 = service.submit(t1) ;
        Future<Integer> result2 = service.submit(t2) ;
        Future<Integer> result3 = service.submit(t3) ;
        Future<Integer> result4 = service.submit(t4) ;
        Future<Integer> result5 = service.submit(t5) ;
        Future<Integer> result6 = service.submit(t6) ;


        System.out.println(result1.get());
        System.out.println(result2.get());
        System.out.println(result3.get());
        System.out.println(result4.get());
        System.out.println(result5.get());
        System.out.println(result6.get());


        service.shutdown();
        if( !service.awaitTermination(10, TimeUnit.SECONDS)){
            System.out.println("FORCFULL SHUT DOWN ");
            service.shutdownNow() ;
        }



    }
}
