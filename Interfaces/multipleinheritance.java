interface Payment{
    public void UPI();
}

interface Bank{
    public void deposit();
}

class FinanceInfo implements Payment,Bank{
    public void UPI(){
        System.out.println("Make Payment using UPI");
    }
    public void deposit(){
        System.out.println("deposit 5000 rs");
    }
}

public class multipleinheritance {
    public static void main(String[] args) {
        FinanceInfo f=new FinanceInfo();

        f.UPI();
        f.deposit();
    }
}
