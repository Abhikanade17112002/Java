package OOPS;

public class Driver {

    static int minAgeForDriving = 18 ;

    public static void changeMinAgeForDriving( int age ){
        minAgeForDriving = age ;

    }

    public void trial( int age ){
        minAgeForDriving = age ;

    }
    public static void main(String[] args) {
//        Car myCar = new Car() ;
//        myCar.getCurrentSpeed();

        Driver myDriver = new Driver();
        myDriver.trial(23);
        System.out.println(minAgeForDriving);

    }
}
