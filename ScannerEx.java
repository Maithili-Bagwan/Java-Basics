
import java.util.Scanner;

public class ScannerEx {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        String name = sc.nextLine();
      
        System.out.println("Enter the number:");
        int n = sc.nextInt();  
         System.out.println("the nextLine ex:" + name); 

         System.out.println("the nextint ex:" + n);
        

    }
    
}
