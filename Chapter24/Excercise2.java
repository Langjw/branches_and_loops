import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter an integer for 'N': ");
        int n = scan.nextInt();

        for (int a = 1; a < n; a = a + 2) {
            System.out.println("N = " + a);
        }
    }
}