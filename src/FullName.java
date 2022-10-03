// Step 1: Import Scanner
import java.util.Scanner;
public class FullName {
    public static void main(String[] args) {
        // Step 2: Creating Scanner Object
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String fname = sc.nextLine();

        System.out.println("Enter last name: ");
        String lname = sc.nextLine();

        String fullName = fname + " "+ lname;
        System.out.println("Full name is "+fullName);

    }
}
