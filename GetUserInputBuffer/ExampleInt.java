import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExampleInt {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your age:");
        int age=Integer.parseInt(br.readLine());
        System.out.println("Age = " + age);
    }
}
