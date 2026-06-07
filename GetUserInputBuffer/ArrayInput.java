import java.io.*;

public class ArrayInput {

    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter numbers:");

        String[] input = br.readLine().split(" ");

        int[] arr = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}