public class TestThreads implements Runnable{
    public void run(){
        System.out.println("test thread");
    }
    public static void main(String args[]){
        (new Thread(new TestThreads())).start();
    }
}