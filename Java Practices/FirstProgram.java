import java.util.*;

public class FirstProgram {
    public static void main(String[] args) {

    
        System.out.println("this is java");
        //to take input from user scanner class is used
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
            int n1 = sc.nextInt();
            int n2 = sc.nextInt();
        System.out.println("the sum of two numbers is "+(n1+n2));
    }
}