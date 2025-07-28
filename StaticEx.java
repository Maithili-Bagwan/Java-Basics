public class NewOpp {
    static void myStaticMethod(){
        System.out.println("Static method called without object");
    }
    public void myPublicMethod(){
        System.out.println("Public method called with object");
    }
    public static void main(String[] args) {
        myStaticMethod();
        NewOpp obj = new NewOpp();
        obj.myPublicMethod();
    }
    
}
