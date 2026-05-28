

class A{
    public void show(){
        System.out.println("In a show");
    }
}

public class AnonymsInnerClass {
    public static void main(String[] args) {
        A obj=new A(){
            public void show(){
                   System.out.println("In in a new show");
            }
         
        };
        obj.show();

    }
}
