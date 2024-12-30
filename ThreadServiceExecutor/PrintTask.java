package ThreadServiceExecutor;

public class PrintTask implements  Runnable {

    private final char targetCharacter ;


    public PrintTask( char targetCharacter ){
        this.targetCharacter = targetCharacter ;

    }
    @Override
    public void run() {

        System.out.println("INSIDE THE RUN METHODE OF THREAD : " + Thread.currentThread().getName());


        for (int i = 1; i < 100 ; i++) {
            try {
                Thread.sleep(30);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(i + ") "+" Target Character : " + this.targetCharacter + " Thread : " +Thread.currentThread().getName() );
        }
        System.out.println(" FINISHED THE RUN METHODE OF THREAD : " + Thread.currentThread().getName());
    }
}
