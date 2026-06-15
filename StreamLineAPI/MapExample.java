
import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<String> list=Arrays.asList("Shubham","Kartikee");

        list.stream()
        .map((n)->n.toUpperCase())
        .forEach((n)->System.out.println(n));
    }
}
