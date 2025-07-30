public class ThreadExtendsEx extends Thread{
    public static void main(String[] args) {
       ThreadExtendsEx thread = new ThreadExtendsEx();
       thread.start();
       System.out.println("THis code is runnung out of thread");
    }
    public void run(){
        System.out.println("The code is running in thread");
    }
    
}
