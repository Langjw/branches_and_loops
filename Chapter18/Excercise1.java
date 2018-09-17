import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        String item;
        int price;
        int delivery;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the item: ");
        item = scan.nextLine();
        
        System.out.println("Enter the price of the item: ");
        price = scan.nextInt();
        
        System.out.println("Overnight delivery: (0 == no, 1 == yes)");
        delivery = scan.nextInt();
        
        System.out.println("");
        System.out.println("Invoice: ");

    }
}