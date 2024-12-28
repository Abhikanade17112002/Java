package OOPS;

public class Car {

    float kmDriven = 0.0f;
    String color = "Pale Grey" ;
    float fuelInLiters = 0.0f ;
    int noOfWheels = 4 ;
    int maxSpeedInKMPerHours = 150 ;
    int currentSpeedInKMPerHours = 50 ;

    public void getCurrentSpeed(){
        System.out.println(this.currentSpeedInKMPerHours) ;
    }



}
