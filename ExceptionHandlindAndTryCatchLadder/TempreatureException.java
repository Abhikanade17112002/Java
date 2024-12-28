package ExceptionHandlindAndTryCatchLadder;

public class TempreatureException extends Exception{
    private String temprature ;

    @Override
    public String getMessage() {
        return this.temprature + " Is Not A Valid Tempreature" ;
    }

    public String getTemprature() {
        return temprature;
    }

    public void setTemprature(String temprature) {
        this.temprature = temprature;
    }
}
