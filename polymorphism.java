class polymorphism {
    public void animalSound(){
        System.out.println("The animal makes the sound");
    }
    public static void main(String[] args) {
        Pig p = new Pig();
        p.animalSound();
        Dog d = new Dog();
        d.animalSound();
    }
    
}

class Pig extends polymorphism{
      public void animalSound(){
        System.out.println("pig:oink oink");
      }

}
class Dog extends polymorphism{
    public void animalSound(){
        System.out.println("Dog :bow bow");
    }
}

