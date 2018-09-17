import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);
        double num;
        double sum;
        double square;
        double sqrt;

        System.out.println("Enter N: ");
        inData = scan.nextInt();
        double N = inData;
        while (N > 0) {
            System.out.println("Enter a number: ");
            inData = scan.nextInt();
            num = inData;
            square = inData * inData;
            sqrt = Math.sqrt(num);
            System.out.println("Square: " + square);
            N = N - 1;
            System.out.println("Square Root: " + sqrt);
            System.out.println(" ");
        }
    }
}