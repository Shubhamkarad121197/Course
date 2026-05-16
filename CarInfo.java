class Car{
    String brand;
    int speed;

    Car(String brand,int speed){
        this.brand=brand;
        this.speed=speed;
    }
    void display(){
        System.out.println("Brand:"+brand);
        System.out.println("speed:"+speed);
    }
}

public class CarInfo{
    public static void main(String args[]){
        Car c1=new Car("Audi",5000);
        Car c2=new Car("Mercedez",4000);

        c1.display();
        c2.display();
    }
}


// Class → Blueprint
// Object → Instance of class
// Constructor → Initializes object
// new keyword → Creates object
// this keyword → Refers to current object