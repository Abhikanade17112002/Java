package CollectionsAndGeneric;
import java.util.HashSet;
import java.util.Set ;
public class SetInterface {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<String>() ;
        System.out.println(mySet.add("Abhishek") );
        System.out.println(mySet.add("Abhishek") );
        System.out.println(mySet.add("Rangnath") );
        System.out.println(mySet.add("Kanade") );
        System.out.println(mySet.remove("Abhishek") );
        System.out.println(mySet.contains("Kanade") );
        System.out.println(mySet.size() );
        System.out.println(mySet.isEmpty() );


    }

}
