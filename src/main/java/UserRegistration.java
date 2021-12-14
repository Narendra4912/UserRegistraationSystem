import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    String firstName, lastName, email;
    String mobileNo;

    public void validUserFirstName(String firstName)
    {
        this.firstName = firstName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(firstName);

        if(matcher.matches())
            System.out.println("User's First Name = "+ firstName +" is matching with the pattern !!!");
        else
            System.out.println("User's First Name = "+ firstName +" is not matching with the pattern !!!");
    }

    public void validUserLastName(String lastName)
    {
        this.lastName = lastName;
        String userRegex = "^[A-Z]{1}[A-Za-z0-9]{2}$";
        Pattern pattern = Pattern.compile(userRegex);
        Matcher matcher = pattern.matcher(lastName);

        if(matcher.matches())
            System.out.println("User's Last Name = "+ lastName +" is matching with the pattern !!!");
        else
            System.out.println("User's Last Name = "+ lastName +" is not matching with the pattern !!!");
    }

    public void validEmailAddress(String email)
    {
        this.email = email;
        String regex = "^[A-Za-z0-9+._-]+@+(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);

        if(matcher.matches())
            System.out.println("User's Email Address = "+ email +" is matching with the pattern !!!");
        else
            System.out.println("User's Email Address = "+ email +" is not matching with the pattern !!!");
    }

    public void validMobileNo(String mobile)
    {
        this.mobileNo = mobile;
        String regex = "^[1-9]{2}( )[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(String.valueOf(mobileNo));

        if(matcher.matches())
            System.out.println("User's Mobile No = "+ mobileNo +" is matching with the pattern !!!");
        else
            System.out.println("User's Mobile No = "+ mobileNo +" is not matching with the pattern !!!");
    }

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);

        /*System.out.println("Enter User's First Name = ");
        String fname = sc.next();
        user.validUserFirstName(fname);

        System.out.println("Enter User's Last Name = ");
        String lname = sc.next();
        user.validUserLastName(lname);

        System.out.println("Enter User's Email Address  = ");
        String email = sc.next();
        user.validEmailAddress(email);*/

        System.out.println("Enter User's Mobile No = ");
        String mobile = sc.next();
        user.validMobileNo(mobile);
    }
}
