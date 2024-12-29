package MultiThreadingAndThreadExecutor;

public class RunnableThreadExecution {
    public static void main(String[] args) {
        RunnableTask firstTask = new RunnableTask("MY FIRST TASK") ;
        RunnableTask secondTask = new RunnableTask("MY SECOND TASK") ;
        RunnableTask thirdTask = new RunnableTask("MY THIRD TASK") ;

        Thread t1 = new Thread(firstTask) ;
        Thread t2 = new Thread(secondTask) ;
        Thread t3 = new Thread(thirdTask) ;

        t1.start();
        t2.start();
        t3.start();



    }
}
