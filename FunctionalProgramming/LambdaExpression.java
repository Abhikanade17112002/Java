package FunctionalProgramming;

import java.util.List;

public class LambdaExpression {
    public static void main(String[] args) {

        List<String> myList  = List.of("Abhishek","Rangnath","Kanade","Rutuja","Rajendra","Rathod") ;
        myList.stream()
                .filter(str->str.contains("h"))
                .forEach(str-> System.out.println(str));
        List<Integer> myList2  = List.of(1,2,3,45,5,6,7,11,8,9,0) ;
        myList2.stream()
                .filter(num-> num%2==0)
                .forEach(num-> System.out.println(num));
    }
}
