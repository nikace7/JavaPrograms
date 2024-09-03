//try catch inside another try catch block is nested try catch
//inner try catch will access outer catch if it cannot handle exception but reverse is not true
import java.util.*;
public class NestedTryCatchDemo {
    public static void main(String[] args){

        try{

            try{
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter any two number");
                int num1 = sc.nextInt();
                int num2 = sc.nextInt();

                int div = num1/num2;
                System.out.println("div is "+div);
            }

            catch(ArrayIndexOutOfBoundsException ar){
            System.out.println("array index out of bound "+ar);
            }
    }catch(Exception e){
        System.out.println("error "+e);
    }
    
}
}
