
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
   public static void main(String args[]){
    List<String> names=Arrays.asList("Shubham","Kartikee","Laxmi","Rajat");


    //First WAY
    Optional<String> str=names.stream()
    .filter(x->x.contains("u"))
    .findFirst();

    System.out.println(str.orElse("Not Found"));


     //Second  WAY
    String name=names.stream()
    .filter(x->x.contains("k"))
    .findFirst()
    .orElse("Not Found");

    System.out.println(name);


   } 
}
