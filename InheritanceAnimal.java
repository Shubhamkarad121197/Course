class Animal{
    void eat(){
        System.out.println("Animal Eats Food");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dog Barks");
    }
}
public class InheritanceAnimal {
    public static void main(String args[]){
        Dog d1=new Dog();
        d1.eat();
        d1.sound();

    }
}
