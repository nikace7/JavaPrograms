//such class whic is declared using abstact keyword and cannot be instantianted (object cannot be created)rules of abstractclass
//1.its object cannot be created
//2.it can have constructor, instance variable and normal method
//3.it can have abstract method (such method tha are declared using abstract keyword and does not have body part(declared only but
//not intialized))
//4.normal class have to inherit abstract class of abstract class should be provided by normal class that inherits such abstract class.
abstract class Calculation{
    //it can have instance variable
    private int x;
    private int y;
    //it can have constrcutor
    public Calculation(int x, int y){
        this.x = x;
        this.y = y;
    }
    //it can have normal method
    public void calcSum(){
        System.out.println("Sum is "+(x+y));
    }
     //it can have abstract method
     public abstract void calcDiff(int x, int y);
     public abstract int calcMul(int x, int y);
    
}
   
    
    //normal class
    class Solution extends Calculation{
        private int x1;
        private int y1;
        public Solution(int x, int y, int x1, int y1){
            super(x, y);//calls constructor of abstact class
            this.x1 = x1;
            this.y1 = y1;
        }
        //normal method of subclass
        public void calcDiv(){
            System.out.println("Division is "+(x1/y1));
        }
        //providing body part of abstract method
        @Override
        public void calcDiff(int x, int y){
            System.out.println("Difference is "+(x-y));
        }
        @Override
        public int calcMul(int x, int y){
            return x*y;
        }
    }



public class AbstractClassDemo {
    public static void main(String[] args) {
        Solution s1 = new Solution(10, 20, 30, 40);
        s1.calcSum();//method of abstract class
        s1.calcDiff(50, 60);//method of subclass
        s1.calcMul(70, 80);
        s1.calcDiv();
        int mul = s1.calcMul(70, 80);
            System.out.println("Multiplication is "+mul);
    }
    
}
