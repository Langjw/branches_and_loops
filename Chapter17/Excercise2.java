import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        int limit;
        int squares = 0;
        int cubes = 0;
        int number = 0;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the limit: ");
        limit = scan.nextInt();

        while (limit > 0) {
            number = number + 1;
            squares = squares + (number * number);
            limit = limit - 1;
            cubes = cubes + (number * number * number);
        }

        System.out.println("The sum of Squares is: " + squares);
        System.out.println("The sum of Cubes is: " + cubes);
    }
}