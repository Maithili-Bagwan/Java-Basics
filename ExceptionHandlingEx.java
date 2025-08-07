public class ExceptionHandlingEx {
    public static void main(String[] args) {
        try{
            int[] mynum = {1,2,3};
            System.out.println(mynum[10]);
        } catch (Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("Try.. catch completed.. and finally executed.");
        }
    }
}
