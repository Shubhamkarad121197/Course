class ShubhamException extends Exception {
    public ShubhamException(String message) {
        super(message);
    }
}

public class CustomException {
    static void validateAge(int age) 
    throws ShubhamException {
        if (age < 18) {
            throw new ShubhamException("Age must be 18");
        }
    }

    public static void main(String args[]) {
         try {

            validateAge(15);

        } catch (ShubhamException e) {

            System.out.println(e.getMessage());
        }
    }
}