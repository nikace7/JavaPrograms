//Exception is any abnormal condition that disturb normal flow of execution.if any exception occur the code below such error 
//will not execute. Exception handling is a mechanism to handle such that other code can be execute in normal way. exception handling
//contains following keywords: try, catch, finally, throw, throws.
//try: any code section that can produce exception is placed on try block
//catch: if any error occur in try block then such exception should be handle from catch
//throw: to explicityly throw an exception
//throws: if exception can occur from method
//finally: code in finally block is always excuted
import java.util.*;//to take input from user
import java.io.*;//to handle input output exception
public class ExceptionHandlingDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any two number");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        //if value of num2 is 0 then exception will occur
        try{
            int div = num1/num2;
            System.out.println("div is "+div);
            //arrayindexofboundexception: if data is inseted more than its size
        
        int []arr1 = new int[3];
        arr1[0] = 10;
        arr1[1] = 20;
        arr1 [2] = 30;
        arr1 [3] = 40;
        }
        
        catch(ArithmeticException a){
            System.out.println("cannot divide by 0 "+a);
        }
        catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("array index out of bound "+ar);
        }
        catch(Exception e){
            System.out.println("error "+e);
        }
        finally{
            System.out.println("finally block is always executed");
        }
            System.out.println("out of catch block");
       

    }
    
}
