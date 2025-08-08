class inheritance {
    protected String name="Lisa";
    public void printName(){
        System.out.println("Name:"+name);
    }
}
class detail extends inheritance{
    public static void main (String[] args){
          inheritance n = new inheritance();
    n.printName();

    }
  
}
