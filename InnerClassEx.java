class OuterClass {
    int x = 10;
    public class innerCls{
        int y = 5;
    }
    
}
public class InnerClassEx{
   public static void main(String[] args) {
       OuterClass oc = new OuterClass();
       OuterClass.innerCls ic = oc.new innerCls();
       System.out.println(oc.x);
       System.out.println(ic.y);
   } 
}
