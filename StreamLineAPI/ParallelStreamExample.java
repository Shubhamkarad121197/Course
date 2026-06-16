import java.util.List;

public class ParallelStreamExample {

    public static void main(String[] args) {

        long start = System.currentTimeMillis();

        List<Integer> list =
                List.of(1,2,3,4,5,6,7,8,9,10);

        List<Integer> result =
                list.parallelStream()
                    .collect(
                        java.util.stream.Collectors.toList()
                    );

        result.parallelStream()
              .map(n -> n * 2)
              .forEach(System.out::println);

        long end = System.currentTimeMillis();

        System.out.println("Time: " + (end - start) + " ms");
    }
}