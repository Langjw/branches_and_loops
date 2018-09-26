import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the amount of guests: ");
        int guests = scan.nextInt();

        for (int a = 365; a > 0; a = a - guests) {
                System.out.println("Probability: " + a / 365);
        }
    }
}