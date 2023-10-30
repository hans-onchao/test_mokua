import java.util.*;

class Main {
    private static String name;
    private static String password;
    private static String mName;
    private static String mPassword;
    private static int age;

    public static void main(String args[]) {
        initialize();
    }

    private static void SignUp() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nSIGN UP\n");
        System.out.println("Please tell enter your name:");
        name = sc.nextLine();
        System.out.println("please tell us your password");
        password = sc.nextLine();
        System.out.println("Wonderful! What's your age?");
        age = sc.nextInt();
        System.out.println("Super Cool!");
        System.out.println("You're now signed up! Please login now!");
        initialize();
    }

    private static void Login() {
        System.out.println("\n\nLOGIN\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("what's your name?");
        mName = sc.nextLine();

        if (mName.equals(name)) {
            System.out.println("Oh, yes! Almost forgot. Hello, " + name);
            System.out.println("Please enter your password");
            mPassword = sc.nextLine();

            if (mPassword.equals(password)) {
                System.out.println("\n\nPROFILE");
                System.out.println("\nYour name is " + name);
                System.out.println("Your password is " + password);
                System.out.println("Your age is " + age);
                
            } else {
                System.out.println("\nWrong password ");
                Login();
            }
        } else {
            System.out.println("\nSorry, I don't remember you. \nHave you signed up?");
            initialize();
        }
    }

    private static void initialize() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Login or Signup? \n\nIf Login press 1\nIf Signup press 2");
        int input = sc.nextInt();

        if (input == 1) {
            Login();
        } else if (input == 2) {
            SignUp();
        } else {
            System.out.println("Invalid choice. Please select 1 for Login or 2 for Signup.");
            initialize();
        }
    }

}
