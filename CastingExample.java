public class CastingExample {

    public static void main(String args[]) {

        // Type Conversion
        int num = 50;
        double d = num;

        System.out.println("Converted double: " + d);

        // Type Casting
        double price = 99.99;
        int finalPrice = (int) price;

        System.out.println("Casted int: " + finalPrice);
    }
}