import java.util.Scanner;

public class Values {
    public static void main(String[] args) {
        int inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Starting Value: ");
        inData = scan.nextInt();
        int startValue = inData;
        System.out.println("Enter End Value: ");
        inData = scan.nextInt();
        int endValue = inData;
        while (startValue <= endValue) {
            System.out.println(startValue);
            startValue = startValue + 1;
        }
    }
}