package MultiThreadingAndThreadExecutor.Exercise;

public class SignalManipulativeThread extends Thread{
    private TrafficSignal trafficSignal ;
    private String color ;

    public SignalManipulativeThread( TrafficSignal trafficSignal , String color ){
        this.trafficSignal = trafficSignal;
        this.color = color ;
        System.out.println(this.color+" "+this.trafficSignal);
    }

    @Override
    public void run() {
        System.out.println("INSIDE A THREAD");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("SETTING SIGNAL ");
        this.trafficSignal.setSignal(this.color);
        System.out.println("SETTING SIGNAL DONE");
    }
}
