import java.util.*;
public class MethodRefEx {
    public static void main(String[] args) {
        List<String> names=Arrays.asList("Shubham","Kartikee","Rajat");

        List<String> uNames=names.stream()
        .map(String::toUpperCase)
        .toList();


        System.out.println(uNames);

    }
}
