import java.util.*;

class Employee {

    int salary;

    Employee(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}

public class StreamEmpExample {

    public static void main(String[] args) {

        List<Employee> employees =
                Arrays.asList(
                        new Employee(30000),
                        new Employee(50000),
                        new Employee(70000)
                );

        employees.stream()
                 .filter(e -> e.getSalary() > 40000)
                 .forEach(e ->
                         System.out.println(
                                 e.getSalary()));
    }
}