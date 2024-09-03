//creating thread by inheritin thread class
class Calculate1 extends Thread{
    //it contains run method which should be compulsary used
    @Override
    public void run(){
        try{
            //displaying even number from 1 to 20
            //in interval of 1 sec
            for(int i=1;i<=20;i++){
                if(i%2==0){
                    System.out.println("Even number: " + i);
                    Thread.sleep(1000);
                }
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Calculate2 extends Thread{
    @Override
    public void run(){
        try{
            for(int i=1;i<=10;i++){
                System.out.println("Square of " + i + " is: " + i*i);
                Thread.sleep(1500);//1.5sec
            }
        }
        catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ThreadClassDemo {
    public static void main(String[] args) {
        Calculate1 c1 = new Calculate1();
        Calculate2 c2 = new Calculate2();
        //to run thread
        c1.start();//it call run method
        c2.start();
    }
    

    
}
