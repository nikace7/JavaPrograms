import java.io.*;
import java.util.*;

public class CharacterStreamDemo {
    public static void main(String[] args){
        try{
            File f1 = new File("Ace2.txt");
            f1.createNewFile();
            //writing through character stream
            FileWriter fw = new FileWriter(f1);
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter line of text");
            String data = sc.nextLine();
            fw.write(data);
            fw.close();
            //reading from file
            FileReader fr = new FileReader(f1);
            Scanner sc1 = new Scanner(fr);
            if(sc1.hasNextLine()){
                System.out.println("Data from file: " + sc1.nextLine());
            }
            

          
        }catch(IOException e){
            System.out.println(e);
        }
    }
    
}
