import java.util.ArrayList;
public class Lambda1 {
    public static void main(String[] args) {
        ArrayList <Integer> number = new ArrayList<>();
        number.add(6);
         number.add(8);
          number.add(3);
           number.add(5);
            number.add(4);
            number.forEach((n)-> {System.out.println(n);});
    }
}
