package homeworkWeek7;
//6. Write a java program to input any number and find out if it’s odd or even

import java.util.Scanner;

public class Program_6_OddOrEven {
    public static void main(String[] args) {
        oddEven();
    }

    public static void oddEven() {
        int x;
        System.out.println("Enter any Number: ");
        Scanner scanner = new Scanner(System.in);
        x = scanner.nextInt();
        scanner.close();

        if (x % 2 == 0) {
            System.out.println("Number " + x + " is even number");

        } else {
            System.out.println("Number " + x + " is odd number");
        }
    }
}


