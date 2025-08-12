import java.io.*;
import java.util.Scanner;
public class CreateFile {
    public static void main(String[] args) {
        try {
            File myBoj = new File("myFile.txt");
            FileWriter fw = new FileWriter("myFile.txt");
            Scanner myReader = new Scanner(myBoj);
            if(myBoj.createNewFile()){
                System.out.println("File created successfully: "+myBoj.getName());
            }else{
                System.out.println("File Already exists "); 
            }
            fw.write("Java an programming language which support object orinted programming");
            fw.close();
             System.out.println("Written in file successfull..."); 
             while(myReader.hasNext()){
                String data = myReader.nextLine();
                System.out.println(data);
             }
        } catch (Exception e) {
             System.out.println("*****Error Creating file*****");
              System.out.println(e.getStackTrace());
        }
    }
}
