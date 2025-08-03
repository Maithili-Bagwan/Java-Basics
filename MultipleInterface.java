interface FirstInterface{
    public void myMethod();
}
interface SecondInterface{
    public void otherMethod();
}
class Demo implements FirstInterface,SecondInterface{
    public void myMethod(){
        System.out.println("My method....");
    }
    public void otherMethod(){
        System.out.println("Other method...");
    }
}
public class MultipleInterface {
    public static void main(String[] args) {
        Demo obj = new Demo();
        obj.myMethod();
        obj.otherMethod();
    }
}
