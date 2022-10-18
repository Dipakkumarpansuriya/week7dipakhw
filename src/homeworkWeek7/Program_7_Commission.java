package homeworkWeek7;
/*7. Write a java program input sales id, seller's name, sales amount, and salary basic and
then fined this sales
Commission
Sales amount >= 50,000 35%
Sales amount >= 30,000 20%
>= 20,000 10%
>= 10,000 5%
< 10,000 2%*/

import java.util.Scanner;

public class Program_7_Commission {
    public static void main(String[] args) {
        Commission();
    }

    public static void Commission() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Sales ID :");
        String salesid = scan.nextLine();
        System.out.print("Enter Seller's Name :");
        String name = scan.nextLine();
        System.out.print("Enter Sales Amount :");
        int amount = scan.nextInt();
        System.out.print("Enter Basic Salary :");
        int Basicsalary = scan.nextInt();
        scan.close();
        if (amount >= 50000) {
            int commission = (amount * 35) / 100;
            System.out.println("Commission :" + (amount * 35) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
        else if (amount >= 30000 && amount < 50000) {
            int commission = (amount * 20) / 100;
            System.out.println("Commission :" + (amount * 20) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
        else if (amount >= 20000 && amount < 30000) {
            int commission = (amount * 10) / 100;
            System.out.println("Commission :" + (amount * 10) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
        else if (amount >= 10000 && amount < 20000) {
            int commission = (amount * 5) / 100;
            System.out.println("Commission :" + (amount * 5) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
        else if ( amount < 10000 && amount >=1) {
            int commission = (amount * 2) / 100;
            System.out.println("Commission :" + (amount * 2) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
        else {
            int commission = amount * 0;
            System.out.println("Commission :" + (amount * 0) / 100);
            System.out.println("Total : " + (Basicsalary + commission));
        }
    }

}



