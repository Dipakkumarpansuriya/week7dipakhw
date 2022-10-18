package homeworkWeek7;
/*10.Write a java program to input any two number and ask user to enter their symbol (+, -,
        /, *) find addition, Subtraction, multiplication and division according to their symbol
        (using if else)*/

import java.util.Scanner;

public class Program_10_Symbol {
    public static void main(String[] args) {
        Calculater();
    }

    public static void Calculater() {
        double x;
        double y;
        char z;

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        System.out.print("Enter your first value : ");
        x = scanner.nextDouble();
        System.out.print("Enter your second value : ");
        y = scanner.nextDouble();
        System.out.print("press Symbol : ");
        z = scanner.next().charAt(0);
        System.out.println();
        scanner.close();

        if (z == '+') {
            System.out.print("Addition of " + x + "+" + y + " = " + (x + y));
        } else if (z == '-') {
            System.out.print("Subtraction of " + x + "-" + y + " = " + (x - y));
        } else if (z == '/') {
            System.out.print("Division of " + x + "/" + y + " = " + (x / y));
        } else if (z == '*') {
            System.out.print("Multiplication of " + x + "*" + y + " = " + (x * y));
        } else
            System.out.print("Invalid Entry");
    }

}