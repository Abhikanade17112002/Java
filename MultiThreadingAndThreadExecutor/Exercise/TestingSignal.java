package MultiThreadingAndThreadExecutor.Exercise;

public class TestingSignal {
    public static void main(String[] args) throws InterruptedException {
        TrafficSignal signal = new TrafficSignal() ;

        SignalManipulativeThread t1 = new SignalManipulativeThread(signal,"GREEN");
        SignalManipulativeThread t2 = new SignalManipulativeThread(signal,"YELLOW");
        SignalManipulativeThread t3 = new SignalManipulativeThread(signal,"RED");

        t1.start();
        t1.join();
        System.out.println(signal.getSignal());
        t2.start();
        t2.join();
        System.out.println(signal.getSignal());
        t3.start();
        t3.join();
        System.out.println(signal.getSignal());

    }
}
