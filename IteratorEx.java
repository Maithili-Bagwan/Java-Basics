import java.util.*;
public class IteratorEx {
    public static void main(String[] args) {
        ArrayList<String> cars= new ArrayList<>();
        cars.add("BMW");
         cars.add("Swift");
          cars.add("Volvo");
           cars.add("BMW");
           Iterator<String> it = cars.iterator();
          while(it.hasNext()){
            System.out.println(it.next());
          }
    }
}
