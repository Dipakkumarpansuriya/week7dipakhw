package homeworkWeek7;
/*2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
        not?*/

import java.util.Scanner;

public class Program_2_LeapYear {

    public static void main(String[] args) {
        year();
    }

    public static void year() {
        System.out.print("Please Enter Year = ");
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        scn.close();

        if (num % 4 == 0) {
            System.out.println("is a leap year");
        } else {
            System.out.println("is not a leap year");
        }

    }
}


