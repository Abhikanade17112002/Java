package MultiThreadingAndThreadExecutor;

public class ThreadsWithJoin {
    public static void main(String[] args) {

        double startTiming = System.currentTimeMillis() ;
        FirstTask t1 = new FirstTask("MY FIRST TASK") ;
        SecondTask t2 = new SecondTask("MY SECOND TASK") ;
        ThirdTask t3 = new ThirdTask("MY THIRD TASK ") ;
        t1.start();
        try
        {
            t1.join();
        } catch (Exception e) {
            System.out.println(e);
        }

        t2.start();
        try
        {
            t2.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        t3.start();
        try
        {
            t3.join();
        } catch (Exception e) {
            System.out.println(e);
        }
        double endTiming = System.currentTimeMillis() ;

        System.out.println(" TOTAL TIMING OF EXECUTION : " + ( endTiming - startTiming) + " " + Thread.currentThread().getName());


    }
}
