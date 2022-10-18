package homeworkWeek7;
//20. Write a Java program to test if an array contains a specific value.

import java.util.Scanner;

public class Program_20_SpecificValue {

    public static void main(String[] args) {

        ArrayValue();
    }

    public static void ArrayValue() {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Value = ");
        a = scanner.nextInt();
        scanner.close();
        int[] num = {1, 2, 3, 4, 5, 6, 8, 12};
        int toFind = a;

        boolean found = false;

        for (int n : num) {
            if (n == toFind) {
                found = true;
                break;
            }
        }

        if (found)
            System.out.println(toFind + " is found.");
        else
            System.out.println(toFind + " is not found.");

    }
}
