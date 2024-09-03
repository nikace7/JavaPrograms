//custom exception refers to creating your own exception(error).to create own exception we have to ingerit Exception class.
//WAP that error if the age given by user is less tha  16
//1.create error class
class AgeError extends Exception{
    @Override
    public String toString(){
        return "FBI warning: Age should be greater than 16";
    }
}
class CustomExceptionEg{
    public void sendAge(int age) throws AgeError{
        if(age<16){
            throw new AgeError();
        }else{
            System.out.println("Congratulations Eligdible for driving license");
        }
    }
}
public class CustomExceptionDemo {
    public static void main(String[]args) {
        CustomExceptionEg c1 = new CustomExceptionEg();
        try{
            c1.sendAge(14);//error can occur
        }catch(AgeError a){
            System.out.println(a);
        }
    }
}
