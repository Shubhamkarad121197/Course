import java.util.Scanner;

public class GetIntFromUser {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter A Age:");
        int age=sc.nextInt();
        System.out.println("Your age is:"+age);
    }
}
