import java.util.Scanner;

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
        System.out.println("Please enter your name:");
        name = sc.nextLine();
        System.out.println("please your password");
        password = sc.nextLine();
        System.out.println("Wonderful! What's your age?");
        age = sc.nextInt();
        System.out.println("Super Cool!");
        System.out.println("You're now signed up! Now you can login in,press enter!");
        initialize();
    }
 