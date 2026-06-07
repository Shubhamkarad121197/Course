
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class BasicExample{
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Your Name:");
        String name= br.readLine();

        System.out.println("My name is:"+name);
    }
}