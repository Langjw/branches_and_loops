import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter N: ");
        inData = scan.nextInt();
        int N = inData;

        double Sum = 1.0/1 + 1.0/2 + 1.0/3 + 1.0/4 + 1.0/5 + 1.0/N;
        System.out.println("Sum is: " + Sum);
    }
}