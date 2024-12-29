package MultiThreadingAndThreadExecutor;

public class SettingMultipleThreadPriority {
    public static void main(String[] args) {

        double startTiming = System.currentTimeMillis() ;
        FirstTask t1 = new FirstTask("MY FIRST TASK") ;
        SecondTask t2 = new SecondTask("MY SECOND TASK") ;
        ThirdTask t3 = new ThirdTask("MY THIRD TASK ") ;
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        double endTiming = System.currentTimeMillis() ;

        System.out.println(" TOTAL TIMING OF EXECUTION : " + ( endTiming - startTiming) + " " + Thread.currentThread().getName());


    }
}
