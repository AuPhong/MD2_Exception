import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class test {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("w3 school", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("W3school visit one time");
        boolean matchFound = matcher.find();
        if (matchFound){
            System.out.println("Found it");
        }
        else {
            System.out.println("Cannot find it");
        }
    }
}
