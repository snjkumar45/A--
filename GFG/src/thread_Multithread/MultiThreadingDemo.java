package thread_Multithread;

 class  A extends Thread{
    public void run(){
        try {
            //display the Thread that is running
            System.out.println("Thread"+Thread.currentThread().getId()+"is Runnng");
            
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Exception is Caught :"+e);
     
        }
        
    }
}
public class MultiThreadingDemo{
    public static void main(String[] args) {
        int n=8;
        for(int i=0;i<n;i++){
            A a=new A();
            a.start();
        }
        
    }
}