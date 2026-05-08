import java.rmi.*;

public class rmiclient {
    public static void main(String args[]) throws Exception {
        try {
            one onex = (one) Naming.lookup("rmi://localhost:1099/palin");
            int m = onex.palin("madam");
            System.out.println("Print : " + m);
            if (m == 1)
                System.out.println("The given string is a Palindrome");
            else
                System.out.println("The given string is not a Palindrome");
        }
        catch (Exception e) {
            System.out.println("Exception: " + e);
        }
    }
}