class EmpSal{
    private int salary;

    public void setSalary(int salary){
        if(salary>0){
            this.salary=salary;
        }else{
            System.out.println("Invalid Salary");
        }

    }

    public int getSalary(){
      return salary;
      
    }

}

public class EmployeeSal {
    public static void main(String args[]){
           EmpSal e = new EmpSal();

        e.setSalary(5000);

        System.out.println(e.getSalary());
    }
}
