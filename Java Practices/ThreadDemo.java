//multithreading is a mechansim by one program can do multiple work at a same time.in java multithreading can be achiece using two ways:
//1.by extending(inheriting) Thread class
//2.by implementing Runnable interface
//One thread is always runnging when program program is created this thread is know as main thread.to execute thread run() method is used

public class ThreadDemo {
    public static void main(String[] args) {
        //main thread
        //extracting current thread
        Thread t1 = Thread.currentThread();
        t1.setName("Luffy Thread");
        System.out.println("Name of thread: " + t1.getName());
        System.out.println("priority is: " + t1.getPriority());
        t1.getPriority();
        t1.setPriority(2);
        System.out.println("new priority is: " + t1.getPriority());
        System.out.println("state is: " + t1.getState());
        //suspending Thread
        //displaying data 10 time by suspending half second
        try{

        
        for(int i=0;i<10;i++){
            System.out.println("this is main thread " + i);
                Thread.sleep(500);//half second
                //it will throw interrupted exception if any intruption occurs between time
        }
    }
        catch(InterruptedException e){
            System.out.println(e);

        }

        
}

}
