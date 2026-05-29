interface Animal{
    public void sound();
}

class Dog implements Animal{
    public void sound(){
        System.out.println("Dog Barks");
    }
}

class Example{
    public static void main(String  args[]){
        Dog d=new Dog();
        d.sound();
    }
}