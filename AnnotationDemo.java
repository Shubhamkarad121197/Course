import java.lang.annotation.*;
import java.lang.reflect.Method;

// Custom Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation {
    String message();
}

// Parent Class
class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }

    @Deprecated
    void oldMethod() {
        System.out.println("This method is deprecated");
    }
}

// Child Class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    @MyAnnotation(message = "Custom Annotation Example")
    void display() {
        System.out.println("Display Method");
    }
}

public class AnnotationDemo {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        // @Override example
        Dog dog = new Dog();
        dog.sound();

        // @Deprecated example
        dog.oldMethod();

        // @SuppressWarnings example
        java.util.ArrayList list = new java.util.ArrayList();
        list.add("Java");
        System.out.println(list);

        // Custom Annotation example
        Method method = Dog.class.getDeclaredMethod("display");

        MyAnnotation annotation =
                method.getAnnotation(MyAnnotation.class);

        System.out.println("Annotation Message: "
                + annotation.message());

        dog.display();
    }
}