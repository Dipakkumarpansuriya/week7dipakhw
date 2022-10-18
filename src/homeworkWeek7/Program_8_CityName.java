package homeworkWeek7;
/*8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
        any other alphabet should be invalid entry*/

import java.util.Scanner;

public class Program_8_CityName {

    public static void main(String[] args) {
        City();
    }
    public static void City() {
        char x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter A to E : ");
        x = scanner.next().charAt(0);
        scanner.close();

        if (x == 'A') {
            System.out.print("Ahmedabad");
        } else if (x == 'B') {
            System.out.print("Bharuch");
        } else if (x == 'C') {
            System.out.print("Calcutta");
        } else if (x == 'D') {
            System.out.print("Delhi");
        } else if (x == 'E') {
            System.out.print("England");
        } else if (x == 'F') {
            System.out.print("Faridabad");
        } else {
            System.out.print("Invalid Entry");
        }
    }
}
