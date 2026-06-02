

class ShubhamException extends Exception {

    public ShubhamException(String message) {
        super(message);
    }
}
public class normalException {
    public static void main(String[] args) {
        int i=0;
        int[] arr=new int[5];
        try {
            // int ans=18/i;
            // System.out.println(ans);
          
            System.err.println(arr[2]);
            // System.err.println(arr[6]);
        throw new ShubhamException("Custom Exception Thrown");
        }catch (ShubhamException e) {
            System.out.println(e.getMessage());
        }
        catch (ArithmeticException e){
              System.out.println("Dont devide by zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
              System.out.println("Stay in your limit");
        }
         catch (Exception e) {
            System.out.println("Something went wrongs");
        }
    }
}
