package homeworkWeek7;
/*1. Write a java program that tells us that Input number is odd or even?
        HINT: use ternary operator (? :)*/

import java.util.Scanner;

public class Program_1_OddOrEven {

    static int a;

    public static void main(String[] args) {
        odd();
    }

    public static void odd() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number = ");
        a = scanner.nextInt();
        scanner.close();

        String result = a % 2 == 0 ? "even number" : "odd number";
        System.out.println(a + " is " + result);



    }

}
