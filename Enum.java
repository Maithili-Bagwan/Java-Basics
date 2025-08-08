public class Enum {

   enum Level {
    LOW,
    Medium,
    High
   }
   public static void main(String[] args) {
    //    Level myVar = Level.High;
       for(Level myVar : Level.values()){
       System.out.println(myVar);
       }
   }
}
