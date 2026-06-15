

import java.util.Arrays;
import java.util.List;

public class DistincExample {
    public static void main(String[] args) {
        List<Integer> nums =
        Arrays.asList(1,1,2,2,3,3);

nums.stream()
    .distinct()
    .forEach(System.out::println);
    }
}
