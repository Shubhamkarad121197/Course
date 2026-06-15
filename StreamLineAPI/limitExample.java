
import java.util.Arrays;
import java.util.List;

public class limitExample {
    public static void main(String[] args) {
        List<Integer> nums =
        Arrays.asList(1,1,2,2,3,3);
        nums.stream()
    .limit(3)
    .forEach(System.out::println);
    }
}
