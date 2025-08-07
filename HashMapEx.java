import java.util.*;
public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> employee = new HashMap<>();
        employee.put(11,"koko"); 
        employee.put(31,"Lisa"); 
        employee.put(5,"Panda"); 
        System.out.println(employee);
        System.out.println("The item access:" + employee.get(31));
        System.out.println("Remove operation:");
        employee.remove(31);
        System.out.println(employee);
        System.out.println("Size operation:" +employee.size());
         System.out.println("Loop through HashMap:");
         //print keys
         for(Integer i : employee.keySet()){
            System.out.println(i);
         }
         //print values
         for(String i : employee.values()){
              System.out.println(i);
         }
         //print both key-value
         for(Integer i : employee.keySet()){
             System.out.println("key: " + i + "Values:" + employee.get(i));
         }
        
    }
}
