/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.csit;
//servlet is a interface which is used to handle request from web browser and response from server there are three ways
//to create servlet
//1.by implementing servlet interface
//2.by using generic class
//3.by using HTTPServlet class: use to handle data from web
//previously servelet reside on javaxpackage now it reside on jakarta package


import jakarta.servlet.*;//servlet
import jakarta.servlet.http.*; //http req
import java.io.*; //for print writer

//creating servlet using servlet interface
public class FirstServlet implements Servlet{
//lifecycle method
    ServletConfig config;
    
    @Override
    public void init(ServletConfig sc) throws ServletException {
        this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {

        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException{
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        pw.println("jkjkjkkjkjkjk");
        pw.close();
}

    @Override
    public String getServletInfo() {
       return"servlet using interface";
    }

    @Override
    public void destroy() {
        //servelet deleted
        System.out.println("servlet die");
       
    }
}
