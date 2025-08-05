interface Animal{
    public void animalSound();
    public void sleep();
}

class Pig implements Animal{
    public void animalSound(){
        System.out.println("Pig says : oink oink");
    }
    public void sleep(){
        System.out.println("Zzzz");
    }
}
public class InterfaceEx {
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        p.sleep();
    }
    
}
//posted
