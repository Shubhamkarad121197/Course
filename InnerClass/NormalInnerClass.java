

class A{
    public void show(){
        System.out.println("In a Show");
    }
    class B{
        public void config(){
            System.out.println("In a config");
        }
    }
}
public class NormalInnerClass {
    public static void main(String a[]){
        A obj=new A();
        obj.show();

        A.B obj1=obj.new B();
        obj1.config();
    }
}
