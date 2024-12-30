package MultiThreadingAndThreadExecutor.Exercise;

public class TrafficSignal {
    private String Signal ;

    public synchronized void setSignal( String Signal ){
        this.Signal = Signal ;
    }


    public String getSignal(){
        return this.Signal ;
    }
}
