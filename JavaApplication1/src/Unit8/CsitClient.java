/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit8;

//request server for services. it is done by looking up server's port and bind to it
import java.rmi.*;
import java.rmi.registry.*;
import java.util.*;
public class CsitClient {
    public static void main(String[] args) throws Exception{
        try{
            Registry creg =
                    LocateRegistry.getRegistry(7777);
            ServiceProvider sp = (ServiceProvider)creg.lookup("csitserver");
            System.out.println("--for first service --");
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first number");
            int num1 = sc.nextInt();
            System.out.println("enter second number");
            int num2 = sc.nextInt();
            int result = sp.findSum(num1, num2);
                System.out.println("sum is :" + result);
                
            
            
        }catch(RemoteException r){
            System.out.println(r);
        }catch(NotBoundException n){
            System.out.println(n);
        }
    }
    
}
