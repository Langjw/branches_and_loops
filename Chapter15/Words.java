import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        String inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter First Word: ");
        inData = scan.nextLine();
        String first = inData;
        int firstLength = first.length();
        System.out.println("Enter Second Word: ");
        inData = scan.nextLine();
        String second = inData;
        int secondLength = second.length();

        int total = firstLength + secondLength;
        int math = 30 - total;
        System.out.println(first);

        while (math > 0) {
            System.out.println(".");
            math = math - 1;
        }
        
        System.out.println(second);
    }
}