import java.util.Scanner;

public class Excercise6 {
    public static void main(String[] args) {
        String userName;
        String password;
        Scanner scan = new Scanner(System.in);

        System.out.println("User Name: ");
        userName = scan.nextLine();
        System.out.println("Password: ");
        password = scan.nextLine();

        if (userName.equals("gates") && password.equals("monopoly")) {
            System.out.println("You have logged on with priority 1");
        }
        else if (userName.equals("shine") && password.equals("down")) {
            System.out.println("You have logged on with priority 2");
        } 
        else if (userName.equals("jobs") && password.equals("apple")) {
            System.out.println("You have logged on with priority 3");
        }
        else if (userName.equals("joy") && password.equals("sun")) {
            System.out.println("You have logged on with priority 4");
        }
        else if (userName.equals("root") && password.equals("secret")) {
            System.out.println("You have logged on with priority 5");
        }
        else if (userName.equals("quit")  && password.equals("exit")) {
            System.out.println("System shutting down.");
            System.out.println("Bye.");
        }
        else {
            System.out.println("Logon failed");
        }
    }
}