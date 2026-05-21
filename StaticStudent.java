class Student{
    String name;

    static String college="MIT";

    public Student(String name){
        this.name=name;
    }

    public void display(){
        System.out.println(name+":"+college);
    }

}


class StaticStudent{
    public static void main(String args[]){


        Student s1=new Student("Shubham");
        Student s2=new Student("Anil");


        s1.display();
        s2.display();

    }
}