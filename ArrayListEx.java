import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
       ArrayList<String> cars= new ArrayList<>();
       cars.add("Porche");
       cars.add("BMW");
       cars.add("Swift");
       System.out.println(cars);
       ArrayList <Integer> myNum= new ArrayList<>();
       myNum.add(1); 
        myNum.add(6); 
         myNum.add(3); 
          System.out.println(myNum);
    System.out.println("For LOOP:");
    for(int i =0 ; i< cars.size();i++){
        System.out.println(cars.get(i));
    }
    System.out.println("For EACH:");
    for(String i : cars){
        System.out.println(i);
        }
        

        System.out.println("SORTED ARRAYLIST:");
        Collections.sort(cars);
       System.out.println("Foe EACH:");
    for(String i : cars){
        System.out.println(i);
        } 

}
}

