abstract  class Vehicle{
    abstract void  start();
    void stop(){
        System.out.println("Vehicle  Stops");
    }

}
class Car extends Vehicle{
 @Override
    void start() {

        System.out.println("Car starts");
    }
}
public class AbstractClassNormal{
   public static void main(String[] args) {
       Vehicle v1=new Car();
       v1.start();
       v1.stop();
   }
}