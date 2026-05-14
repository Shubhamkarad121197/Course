public class Operators {
    public static void main(String args[]){
        int a=10,b=5;
        // Arithmetic
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        //Relationals

        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a<b);

        //Logical Operators
        boolean x=true;
        boolean y=false;

        System.out.println(x&&y);
        System.out.println(x||y);
        System.out.println(!x);

        //Unary Operators
        int u=10;
        System.out.println(u++);
        System.out.println(++u);
        System.out.println(u--);
        System.out.println(--u);

        //Bitwise Operator
        int s=5,t=3;
        System.out.println(s&t);
        System.out.println(s|t);
        System.out.println(s^t);
        System.out.println(~s);


        //Shift Operator
        int s1=8;
        System.out.println(s1<<1);
        System.out.println(s1>>1);

        //Ternary Operator
        int age=19;
        System.out.println(age>=18?"Can Vote":"Under Age");

        //InstanceOf Operator
        String name="Shubham";
        System.out.println(name instanceof String);



    }
}
