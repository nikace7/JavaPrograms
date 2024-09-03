//one interface can inherit another interface.
//a class that implements such child interface have to provide body part of methods of both interface
interface Calc1{
    void multi(int x, int y);
}
interface Calc2 extends Calc1{
    void div(int x, int y);
}
class Sol implements Calc2{
    @Override
    public void div(int x, int y){
        System.out.println("div is "+(x/y));
    }
    @Override
    public void multi(int x, int y){
        System.out.println("mul is"+(x*y));
    }

}

public class InheritanceInterfaceDemo {
    public static void main(String[] args){
        Sol s1 = new Sol();
        s1.div(100,2);
        s1.multi(9,8);

    }
    
}
