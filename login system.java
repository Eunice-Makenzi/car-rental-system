import java.io.Console;
import java.util.Scanner;

public class LoginSystem {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "password123";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter password: ");
            String inputPassword = maskPassword();

            if (inputUsername.equals(USERNAME) && inputPassword.equals(PASSWORD)) {
                System.out.println("Login successful!");
                return;
            } else {
                attempts--;
                System.out.println("Incorrect credentials. Attempts left: " + attempts);
            }
        }
        System.out.println("Account locked. Too many failed attempts.");
    }

    public static String maskPassword() {
        StringBuilder password = new StringBuilder();
        try {
            Console console = System.console();
            if (console != null) {
                char[] pwdArray = console.readPassword();
                return new String(pwdArray);
            } else {
                // Fallback for IDEs
                Scanner scanner = new Scanner(System.in);
                return scanner.nextLine(); // Without masking
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}