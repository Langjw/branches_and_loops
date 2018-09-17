import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        int hours;
        int zones;
        int depart;
        int arrive;
        int recovery;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter the number of hours traveled: ");
        hours = scan.nextInt();

        System.out.println("Please enter the number of time zones crossed: ");
        zones = scan.nextInt();

        System.out.println("Please enter the time of your departure: ");
        depart = scan.nextInt();

        System.out.println("Please enter the time of your arrival: ");
        arrive = scan.nextInt();

        recovery = (hours/2 + (zones-3) + depart + arrive)/10;

        System.out.println("Days needed to recover: " + recovery);
    }
}