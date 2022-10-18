package homeworkWeek7;

import java.util.Scanner;

public class Program_13_Day {
    public static void main(String[] args) {
        days();
    }
    public static void days() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter number 1 to 7 : ");
        int day = scanner.nextInt();
        scanner.close();

        String dayName = "";
        switch (day) {
            case 1:
                System.out.println("MONDAY");
                break;
            case 2:
                System.out.println("TUESDAY");
                break;
            case 3:
                System.out.println("WEDNESDAY");
                break;
            case 4:
                System.out.println("THURSDAY");
                break;
            case 5:
                System.out.println("FRIDAY");
                break;
            case 6:
                System.out.println("SATURDAY");
                break;
            case 7:
                System.out.println("SUNDAY");
                break;
            default:
                System.out.println("Week contains 1 to 7 days");

        }

    }
}