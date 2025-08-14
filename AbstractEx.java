abstract class Animal{
    abstract void animalSound();
    public void sleep(){
        System.out.println("Zzz");
    }
}
 class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig says:oink oink");
    }
}
public class AbstractEx {
 public static void main(String[] args) {
     Pig p = new Pig();
     p.animalSound();
     p.sleep();
 }    
}
