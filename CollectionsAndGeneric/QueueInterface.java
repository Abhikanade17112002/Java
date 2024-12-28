package CollectionsAndGeneric;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface {

    public static void main(String[] args) {
        Queue<String> myQueue = new LinkedList<String>() ;

        System.out.println(myQueue.add("FirstName : ") ) ;
        System.out.println(myQueue.offer("Abhishek") );
        System.out.println(myQueue.remove() );
        System.out.println(myQueue.poll() );
        System.out.println(myQueue.peek() );
       try
       {
           System.out.println(myQueue.element() );

       } catch (Exception e) {
           System.out.println(e);
       }




    }

}
