package homeworkWeek7;
/*16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
“ZERO”*/

import java.util.Scanner;

public class Program_16_CheckNumber {
    public static void main(String[] args) {
        Number();
    }
    public static void Number() {

        int num;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = scanner.nextInt();
        scanner.close();

        if (num > 0) {
            System.out.println("The number is positive.");
        } else if (num < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}