package ControlStatementsAndStrings;

import java.util.Scanner;

public class Circle {

    float radius ;

    Circle( float radius) {
        this.radius = radius ;
    }


    public float calculateArea(){
        float calulatedArea = (float)(Math.PI*this.radius*this.radius) ;
        return calulatedArea ;
    }

    public float calculateCircumference(){
        float calculatedCircumference = (float)(2*Math.PI*this.radius) ;
        return calculatedCircumference ;
    }

    public static void main(String[] args) {
        Scanner myScanner = new Scanner( System.in ) ;
        Circle myCircle  ;
        System.out.print("Enter The Radius Of The Circle : " );
        float radius = myScanner.nextFloat();


        myCircle = new Circle(radius) ;

        System.out.println("Area : " + myCircle.calculateArea());
        System.out.println("Circumference : " + myCircle.calculateCircumference());


    }
}
