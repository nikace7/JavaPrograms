/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unit8;

//RMI stands for remote method invocation inwhich one object can invoke method og another object running in separate JVM.
//it consist three parameter remote object which services are prpvided server which uses service provider to provide services to client
//c;oent usees request services from server
//for server rmi registry should be created and for client registry should be invoked client send needde parameter to server
//known as marshalling and it invoke required parameter from server know as unmarshalling
//steps to create RMI
//1. create remote object (interface)
//2. create server (SKELETON) by registering rmi reg
//3. create client (STUB) by invoking rmi registry


import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;

public class CsitServer extends UnicastRemoteObject
implements ServiceProvider
{
    public CsitServer() throws Exception{}
    //implements method define by service provider interface
    @Override
    public int findSum(int x, int y){
        return (x+y);
    }
    @Override
    public String findReverse(String data){
        return "hello";
    }
    public static void main(String[] args) throws Exception{
        //register server
        try{
            Registry reg = 
          LocateRegistry.createRegistry(7777);
            //bind server
            reg.rebind("csitserver", new CsitServer());
            System.out.println("server ready to serve");
        }catch(RemoteException r){
        System.out.println(r);
    }
}
}
