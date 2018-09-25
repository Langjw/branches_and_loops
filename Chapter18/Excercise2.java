import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int fr;
        int fl;
        int br;
        int bl;
        System.out.println("Input front right tire pressure:");
        fr = scan.nextInt();
        
        System.out.println("Input front left tire pressure:");
        fl = scan.nextInt();

        System.out.println("Input back right tire pressure: ");
        br = scan.nextInt();

        System.out.println("Input back left tire pressure: ");
        bl = scan.nextInt();

        if (fr == fl && br == bl) {
            System.out.println("Inflation is OK");
        }
        else {
            System.out.println("Inflation is not OK");
        }
    }
}