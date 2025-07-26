public class User {
  private String name;
  public String getName(){
    return name;
  }    
  public void setName(String newName){
    this.name=newName;
  }
  public static void main(String[] args) {
      User newUser=new User();
      newUser.setName("John");
      System.out.println(newUser.getName()); 
  }

}
