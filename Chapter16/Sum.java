import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);
        int total = 0;

        System.out.println("How many integers will be added: ");
        inData = scan.nextInt();
        int amount = inData;

        while (amount > 0) {
            System.out.println("Enter an integer: ");
            inData = scan.nextInt();
            total = inData + inData;
            amount = amount - 1;
        }

        System.out.println("The sum is: " + total);
    }
}