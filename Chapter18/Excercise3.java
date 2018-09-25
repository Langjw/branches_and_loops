import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int frontRight;
        int frontLeft;
        int backRight;
        int backLeft;

        System.out.println("Input front right tire pressure:");
        frontRight = scan.nextInt();
        if (frontRight < 35) {
            System.out.println("Warning: pressure is too low");
        }
        if (frontRight > 45) {
            System.out.println("Warning: pressure is too high");
        }
        
        System.out.println("Input front left tire pressure:");
        frontLeft = scan.nextInt();
        if (frontLeft < 35) {
            System.out.println("Warning: pressure is too low");
        }
        if (frontLeft > 45) {
            System.out.println("Warning: pressure is too high");
        }

        System.out.println("Input back right tire pressure: ");
        backRight = scan.nextInt();
        if (backRight < 35) {
            System.out.println("Warning: pressure is too low");
        }
        if (backRight > 45) {
            System.out.println("Warning: pressure is too high");
        }

        System.out.println("Input back left tire pressure: ");
        backLeft = scan.nextInt();
        if (backLeft < 35) {
            System.out.println("Warning: pressure is too low");
        }
        if (backLeft > 45) {
            System.out.println("Warning: pressure is too high");
        }

        if (frontRight == frontLeft && backRight == backLeft) {
            System.out.println("Inflation is OK");
        }
        else {
            System.out.println("Inflation is not OK");
        }
    }
}