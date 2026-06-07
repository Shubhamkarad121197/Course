import java.io.*;

public class MultipleInput {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Name: ");
        String name = br.readLine();

        System.out.print("Enter Age: ");
        int age = Integer.parseInt(br.readLine());

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}