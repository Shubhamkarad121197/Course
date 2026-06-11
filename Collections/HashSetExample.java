
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> nums=new HashSet<>();
        nums.add(34);
        nums.add(78);
        nums.add(34);
        nums.add(68);

        System.out.println(nums);
    }
}
