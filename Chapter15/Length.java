import java.util.Scanner;

public class Length {
    public static void main(String[] args) {
        String inData;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        inData = scan.nextLine();
        String word = inData;
        int times = inData.length();
        System.out.println(" ");
        while (times > 0) {
            System.out.println(word);
            times = times - 1;
        }
    }
}