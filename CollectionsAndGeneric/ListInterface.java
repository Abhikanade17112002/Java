package CollectionsAndGeneric;

import java.util.ArrayList;

public class ListInterface {

    public static void main(String[] args) {
        ArrayList < String > myList = new ArrayList<String>() ;

        myList.add("Abhishek") ;
        myList.add("Rangnath") ;
        myList.add("Kanade") ;

        myList.add(0,"First Name :") ;
        myList.add(2,"Middle Name :") ;
                myList.add(4,"Last Name :") ;





        for (String s : myList) {
            System.out.println(s);
        }

    }
}
