import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void main(String[] args) {

        String userName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);

        System.out.println("Enter User Name = ");
        Scanner sc = new Scanner(System.in);
        userName = sc.next();

        Matcher matcher = pattern.matcher(userName);

        if(matcher.matches())
            System.out.println("User Name = "+ userName +" is matching with the pattern !!!");
        else
            System.out.println("User Name = "+ userName +" is not matching with the pattern !!!");


    }
}
