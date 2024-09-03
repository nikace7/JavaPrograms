//inplementing Runnable interface
class Calculate3 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("T1: " + i);
            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
class Calculate4 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("T2: " + i);
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println(e);
            }
        }
    }
}
public class RunnableDemo {
    public static void main(String[] args) {
        Calculate3 c3 = new Calculate3();
        Calculate4 c4 = new Calculate4();
        //to create thread, thread class should be used
        Thread t1 = new Thread(c3);
        Thread t2 = new Thread(c4);
        t1.start();
        t2.start();
    }
    
}
