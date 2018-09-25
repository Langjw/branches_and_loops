import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int account;
        double amount;
        System.out.println("Are you using a checking or savings account: (1 for checking, 2 for savings)");
        account = scan.nextInt();
        
        if (account == 1) {
            System.out.println("Please enter the total amount of money in your account:");
            amount = scan.nextInt();
            if (amount < 1000) {
                System.out.println("You have a $0.15 service charge per check.");
            }
            else if (amount >= 1000) {
                System.out.println("You do not have a service charge for checks.");
            }
        }
        if (account == 2) {
            System.out.println("Please enter the total amount of money in your account:");
            amount = scan.nextInt();
            if (amount < 1500) {
                System.out.println("You have a $0.15 service charge per check.");
            }
            else if (amount >= 1500) {
                System.out.println("You do not have a service charge for checks.");
            }
        }
    }
}