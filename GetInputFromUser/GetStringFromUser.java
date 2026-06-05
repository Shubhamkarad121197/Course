

import java.util.Scanner;
public class GetStringFromUser {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your Name:");
        String name=sc.next();
        System.out.println("Hello I am, "+name);

    }
}
