package CollectionsAndGeneric;

public class VariableArguments {
    public static void main( String [] args ){

        System.out.println(addIntegers(1,2,3,4,5,6,7,8,9));
    }
    public static int addIntegers( int a , int b , int... params ){


        int Sum = a + b  ;
        for (int param : params) {
            Sum += param ;

        }

        return Sum ;

    }

}
