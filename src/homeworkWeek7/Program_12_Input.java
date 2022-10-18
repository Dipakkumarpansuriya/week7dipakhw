package homeworkWeek7;
//12. Write a program that tells us input value is number or an alphabet or symbol.

import java.util.Scanner;

public class Program_12_Input {
    public static void main(String[] args) {
        identifyInput();

    }
    public static void identifyInput() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any character : ");
        char ch = scanner.next().charAt(0);
        scanner.close();

        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            System.out.println("is A ALPHABET.");

        } else if (ch >= '0' && ch <= '9') {
            System.out.println("is A DIGIT.");

        } else {
            System.out.println("is A SPECIAL CHARACTER.");
        }

    }
}
