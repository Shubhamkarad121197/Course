
public class normalException {
    public static void main(String[] args) {
        int i=0;
        try {
            int ans=18/i;
            System.out.println(ans);
        }
        catch (ArithmeticException e){
              System.out.println("Dont devide by zero");
        }
         catch (Exception e) {
            System.out.println("Something went wrongs");
        }
    }
}
