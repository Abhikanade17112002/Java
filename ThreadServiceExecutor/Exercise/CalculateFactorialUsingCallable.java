package ThreadServiceExecutor.Exercise;

import java.util.concurrent.Callable;

public class CalculateFactorialUsingCallable implements Callable<Integer> {
    private final int myInteger ;
    public CalculateFactorialUsingCallable( int myInteger ){
        this.myInteger = myInteger ;
    }

    public Integer call(){
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println(" I Am Inside The Call Methode Using Thread : "  +Thread.currentThread().getName());
        System.out.println("Calculating The Fatorial Of The Number : " + this.myInteger);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        int factorial = 1 ;
        for (int i = 1; i <= this.myInteger ; i++) {
            factorial *= i ;
        }
        System.out.println("Calculation Finished \n");

        return factorial ;
    }
}
