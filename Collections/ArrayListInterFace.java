import java.util.*;

public class ArrayListInterFace {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();

        names.add("Rajan");
        names.add("Sharad");
        names.add("Ajit");

        System.out.println(names);
        System.out.println(names.get(2));
        names.set(0,"Kartikee");
        System.out.println(names);
    }
}
