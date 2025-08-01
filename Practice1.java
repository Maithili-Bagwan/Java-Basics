import java.util.*;
public class Practice1 {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   String letters= " ",numbers= "";
    System.out.println("Enter the String:");
   String input = sc.nextLine();
   for(int i = 0 ; i< input.length();i++){
     char ch= input.charAt(i);
     if(Character.isLetter(ch)){
        letters+= ch;
       }else if(Character.isDigit(ch)){
        numbers += ch;
       }
   }

   System.out.println("Characters:"+ letters);
    System.out.println("Numbers:"+ numbers);
}    
}
