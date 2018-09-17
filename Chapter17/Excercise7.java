import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        int r;
        int n;
        int total = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a value for n: ");
        n = scan.nextInt();
        if (n > 0) {
            System.out.println("Please enter a value for r: ");
            r = scan.nextInt();
            if (r > n) {
                System.out.println("Please enter a value that is less than n: ");
                r = scan.nextInt();
            }
            else {
                total = n/(n-r);
                System.out.println("The total is: " + total);
            }
        }
        else {
            System.out.println("Please enter a positive value for n: ");
            n = scan.nextInt();
        }
    }
}