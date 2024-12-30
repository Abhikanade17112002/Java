package MultiThreadingAndThreadExecutor.Exercise;

public class TestingAnounccerThread {
    public static void main(String[] args) throws InterruptedException {

        AnounccerThread t1 = new AnounccerThread("FIRST THREAD") ;
        AnounccerThread t2 = new AnounccerThread("SECOND THREAD") ;

        t1.start();
        t1.join();
        t2.start();
        t2.join();

    }


}
