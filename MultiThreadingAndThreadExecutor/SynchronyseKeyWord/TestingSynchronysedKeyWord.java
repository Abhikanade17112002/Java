package MultiThreadingAndThreadExecutor.SynchronyseKeyWord;

public class TestingSynchronysedKeyWord {
    public static void main(String[] args) {
        Counter counter = new Counter() ;
        UpdaterThread t1 = new UpdaterThread(counter) ;
        UpdaterThread t2 = new UpdaterThread(counter) ;


        try{
           t1.start();
           t2.start();
           t1.join();
           t2.join();
        } catch (Exception e) {
            System.out.println("Exception Ocurred : " + e) ;
        }


        System.out.println("The Value Of The Counter Is : " + counter.getCount());

    }
}
