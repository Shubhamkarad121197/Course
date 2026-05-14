public class Loops {
    public static void main(String[] args) {
        int n=5;
        // For loop
        for(int i=0;i<n;i++){
            System.out.println("Hello Forloop:"+i);
        }

        //while loop
        int count=0;
        while(count<n){
            System.out.println("Hello While loop"+count);
            count++;
        }

        //Do while loop
        count=0;
        do{
            System.out.println("In Do"+count);
            count++;
        }while(count<=n); 
    }
}
