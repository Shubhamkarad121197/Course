class Animal{
    void eat(){
        System.out.println("Animal Eats Food");
    }
}

class Dog extends Animal{
    void sound(){
        System.out.println("Dogs Barks");
    }
}

class Puppy extends Dog{
     void weep() {

        System.out.println("Weeping");
    }
}

public class MultiLevelInheritance {
    public static void main(String args[]){
             Puppy p = new Puppy();
             p.eat();
             p.sound();
             p.weep();
    }
}
