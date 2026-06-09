

class MyTask implements Runnable{
    public void run(){
        System.out.println("Task is running");
    }
}

public class RunnableThread {
    public static void main(String args[]){
        Thread t1=new Thread(new MyTask());
        t1.start();
    }
}
