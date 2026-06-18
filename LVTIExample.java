import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LVTIExample {
    public static void main(String args[]) {
        // =====================================
        // LVTI (JAVA 10)
        // Local Variable Type Inference
        // =====================================

        // Syntax
        var name = "Shubham"; // String
        var age = 25; // int
        var salary = 50000.50; // double
        var active = true; // boolean

        // =====================================
        // COLLECTIONS
        // =====================================

        var list = new ArrayList<String>();

        list.add("Java");
        list.add("Spring");

        var map = new HashMap<Integer, String>();

        map.put(1, "Java");
        map.put(2, "Spring");

        // =====================================
        // ARRAYS
        // =====================================

        var numbers = new int[] { 10, 20, 30, 40 };

        for (var num : numbers) {
            System.out.println(num);
        }

        // =====================================
        // STREAM API
        // =====================================

        var nums = List.of(1, 2, 3, 4, 5, 6);

        var even = nums.stream()
                .filter(n -> n % 2 == 0)
                .toList();

        System.out.println(even);

        // =====================================
        // FOR LOOP
        // =====================================

        for (var i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // =====================================
        // ENHANCED FOR LOOP
        // =====================================

        var names = List.of("Java", "Spring", "React");

        for (var n : names) {
            System.out.println(n);
        }

        // =====================================
        // VALID
        // =====================================

        var x = 10;
        var y = 10.5;
        var ch = 'A';
        var str = "Hello";

        // =====================================
        // INVALID
        // =====================================

        // var a; ❌ No initialization

        // var value = null; ❌ Cannot infer type

        // class Test{
        // var age = 25; ❌ Not allowed as field
        // }

        // void show(var age){} ❌ Not allowed in parameters

        // =====================================
        // TYPE IS FIXED
        // =====================================

        var num = 100;

        // num = "Java"; ❌ Compile Error

        // =====================================
        // INTERVIEW QUESTIONS
        // =====================================

        // Q1: Introduced in?
        // Java 10

        // Q2: What does var do?
        // Compiler infers type automatically

        // Q3: Can var be used for fields?
        // No

        // Q4: Can var be null?
        // No

        // Q5: Can var change type later?
        // No

        // Q6: Is Java dynamically typed because of var?
        // No, Java is still statically typed

        // =====================================
        // MOST COMMON USAGE
        // =====================================

        var employees = new ArrayList<String>();

        var result = employees.stream()
                .filter(e -> !e.isEmpty())
                .toList();

        // var → Java 10
        // Only Local Variables
        // Must Initialize Immediately
        // Cannot Use null
        // Cannot Use for Fields
        // Cannot Use for Method Parameters
        // Type Fixed After Inference
        // Works Great with Collections & Streams
        // Java Remains Statically Typed
    }
}
