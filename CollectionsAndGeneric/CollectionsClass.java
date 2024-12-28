package CollectionsAndGeneric;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsClass {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>() ;

        myList.add(9);
        myList.add(3);
        myList.add(7);
        myList.add(0);
        myList.add(8);
        myList.add(2);
        myList.add(0);
        myList.add(6);
        myList.add(8);
        myList.add(6);


        for (Integer i : myList) {
            System.out.print("i = " + i + "\t");
        }
        Collections.sort(myList);
        Collections.reverse(myList);
        Collections.binarySearch(myList,3) ;
        Collections.min(myList);
        Collections.max(myList) ;
    }
}
