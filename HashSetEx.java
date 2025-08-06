import java.util.*;
public class HashSetEx {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<>();
        cars.add("BMW");
         cars.add("Swift");
          cars.add("Volvo");
           cars.add("BMW");//item added twice but will only appear once
          System.out.println(cars);
          System.out.println("Check if item exists:" + cars.contains("Volvo"));
          System.out.println("Remove item:" + cars.remove("Swift")+ cars);//to remove all items use cllear()
           System.out.println("HashSet Size:" + cars.size());
            System.out.println("Loop through HashSet:");
            for(String i : cars){
                 System.out.println(i);
            }
 
    }
}
