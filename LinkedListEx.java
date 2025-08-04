import java.util.*;
public class LinkedListEx{
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
         cars.add("Audi");
          cars.add("Swift");
        System.out.println(cars);
        System.out.println("=====================================");
        System.out.println("The Add first method:");
        cars.addFirst("porche");
        System.out.println(cars);
 System.out.println("=====================================");
        System.out.println("The Add Last method:");
        cars.addLast("BMW");
        System.out.println(cars);
 System.out.println("=====================================");
        System.out.println("The Remove first method:");
        cars.removeFirst();
        System.out.println(cars);
 System.out.println("=====================================");
        System.out.println("The Remove Last method:");
        cars.removeLast();
        System.out.println(cars);
 System.out.println("=====================================");
        System.out.println("The get first method:");
        String f = cars.getFirst();
        System.out.println(f);
 System.out.println("=====================================");
        System.out.println("The get Last method:");
        String l = cars.getLast();
        System.out.println(l);

    }
}
