
import java.util.*;



public class BasicExample {

    public static void main(String[] args) {
        List<Integer> list=Arrays.asList(5,6,7,8,4,8);
        // for(int n:list){
        //     if(n%2==0){
        //          System.out.println(n);
        //     }
           
        // }
      list.stream()
     .filter((n)->n%2==0)
    .forEach((n)->System.out.println(n));


    }
    
}
