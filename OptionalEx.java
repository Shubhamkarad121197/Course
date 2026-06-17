
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalEx {
   public static void main(String args[]){
    List<String> names=Arrays.asList("Shubham","Kartikee","Laxmi","Rajat");

  Optional<String> str=names.stream()
    .filter(x->x.contains("s"))
    .findFirst();

    System.out.println(str.orElse("Not Found"));


   } 
}
