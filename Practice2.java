import java.util.*;
public class Practice2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the String:");
        String input = sc.nextLine().toLowerCase();
         int num=0;
        for(int i =0 ; i< input.length();i++){
            char ch = input.charAt(i);
           
            if(ch=='a'|| ch=='e'|| ch=='i'||ch=='o'||ch=='u'){
               num++;
            }
            
        }
        System.out.println("Number of vowels: "+num);
    }
}
