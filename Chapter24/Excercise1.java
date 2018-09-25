import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double sheep = 20;
        double a = 10 * 0.83;
        double b = 20/(1+a);
        

        //sheep = 220/(1 + 10(0.83)years);

        for (int years = 0; years <= 25; years ++) {
            System.out.println(years + " years");
            sheep = b * years;
            System.out.println(sheep);
        }
    }
}