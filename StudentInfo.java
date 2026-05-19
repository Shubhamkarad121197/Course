class Student{
    private String name;
    private int age;

    public Student(){
        name="Shubham";
        age=28;
    }

    //Setters
    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }

    //Getters
    public String getName(){
        return name;
    }

     public int getAge(){
        return age;
    }

}

public class StudentInfo {
    public static void main(String args[]){
        Student s1=new Student();
        
        System.out.println(s1.getName()+":"+s1.getAge());

        s1.setName("Anuja");
        s1.setAge(25);

          System.out.println(s1.getName()+":"+s1.getAge());
    }
}
