// Concept of Method Overloading

class Calculator{
    int add(int num1,int num2){
        return num1+num2;
    }
    int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }

   
}

public class Addition{
    public static void main(String args[]){
        Calculator c1=new Calculator();
        int result1=c1.add(23,45);
        Calculator c2=new Calculator();
        int result2=c2.add(34,56,78);

        System.out.println("result for First Addition:"+result1);
        System.out.println("Result for second addition:"+result2);

    }
}