abstract class A{
    public abstract void show();
    public abstract void config();
}

public class AbstractInnerClass {
    public static void main(String args[]){
        A obj=new A(){
            public void show(){
                System.out.println("In a abstract inner class");
            }
            public void config(){
                System.out.println("In a abstract Config class");
            }
        };

        obj.show();
        obj.config();
    }
}
