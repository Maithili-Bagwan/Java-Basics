public class ThreadImplementEx implements Runnable {
    public static void main(String[] args) {
        ThreadImplementEx obj = new ThreadImplementEx();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("THis code is outside thread");
    }
    public void run(){
        System.out.println("THis code is in thread");
    }
    
}
