package homeworkWeek7;
//9. Same as above program-8 using switch statement.

import java.util.Scanner;

public class Program_9_switch {
    public static void main(String[] args) {
        City();
    }
    public static void City() {
        String x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A to E : ");
        x = scanner.next();
        scanner.close();

        switch (x) {
            case "A":
                System.out.println("Ahmedabad");
                break;
            case "B":
                System.out.println("Baroda");
                break;
            case "C":
                System.out.println("Calcutta");
                break;
            case "D":
                System.out.println("Delhi");
                break;
            case "E":
                System.out.println("E");
                break;
            case "F":
                System.out.println("Faridabad");
                break;
            default:
                System.out.println("Invalid Entry");

        }
    }
}
