import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExExample {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("My world" ,Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("My mom is my world");
        boolean matchFound = matcher.find();
        if(matchFound){
            System.out.println("match Found");
        }else{
            System.out.println("match Not Found"); 
        }
    }
}
