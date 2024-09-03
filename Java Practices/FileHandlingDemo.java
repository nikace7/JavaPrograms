//In java file is created object of File class.it is inside java.io.*; package.data are passed to and form file using streams
//stream is consider sequence of byte there are two ways to pass data to and form file file 
//1. Byte stream: here data are changed into byte then transfer into file.two classes are used
//a. FileInputStream: to read file using bytestream
//b. FileOutputStream: to write file using bytestream
//2. Character stream: here data are changed into unicode then transfer into file.two classes are used
//a.FileWriter: to write into file using character stream
//b.FileReader: to read file using character stream
import java.io.*;
public class FileHandlingDemo {
    public static void main(String[] args) {
        File f1 = new File("Ace1.txt");
        try{
            if(!f1.exists()){
                f1.createNewFile();
            }
            else{
                System.out.println("File already exists");
            }
        System.out.println("file does exist."+f1.exists());
        System.out.println("path of file is "+f1.getPath());
        System.out.println("absolute path "+f1.getAbsolutePath());
        System.out.println("file size is "+f1.getFreeSpace());
        System.out.println("is f1 directory? "+f1.isDirectory());
        System.out.println("---reading and writing to  "+ "file using byte stream---");
        //write to file
        FileOutputStream fos = new FileOutputStream(f1);
        String s = "This is file Handling demo";// data
        //changing into byte
        byte []data = s.getBytes();
        fos.write(data);//writing to file
        fos.close();
        //reading from file using byte stream
        FileInputStream fis = new FileInputStream(f1);
        int i = 0;
        while((i=fis.read())!=-1){//read upto end of file
            System.out.print((char)i);//cast into character

        }
        }catch(IOException e){
            System.out.println(e);
        
    }
    
}
}
