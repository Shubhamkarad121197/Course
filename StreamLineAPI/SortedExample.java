import java.util.Arrays;
import java.util.List;

public class SortedExample {
    public static void main(String[] args) {
        List<Integer> nums =
        Arrays.asList(30, 10, 20);

nums.stream()
    .sorted()
    .forEach(System.out::println);
    }
}
