import java.util.Scanner;

public class Excercise4 {
    public static void main(String[] args) {
        String word;
        int length;
        int character = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word: ");
        word = scan.nextLine();
        length = word.length();

        while (length > 0) {
            System.out.println(word.charAt(character));
            length = length - 1;
            character = character + 1;
        }
    }
}