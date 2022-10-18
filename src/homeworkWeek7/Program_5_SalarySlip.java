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

public class Program_5_SalarySlip {
    public static void main(String[] args) {
        Salary();
    }

    public static void Salary() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        String empid = scan.nextLine();
        System.out.print("Enter Employee Name: ");
        String name = scan.nextLine();
        System.out.print("Enter Basic salary: ");
        double salary = scan.nextDouble();
        scan.close();
        System.out.println("|---------------------------------|");
        System.out.println("|           Salary slip           |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        System.out.println("| Employee ID         :  " + empid + "     |");
        System.out.println("| Employee Name       :  " + name + "      |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        System.out.println("| Basic Salary        : " + salary + "   |");
        double HRA = (salary * 10) / 100;
        System.out.println("| HRA  10%            :  " + HRA + "   |");
        double TA = (salary * 9) / 100;
        System.out.println("| TA  8%              :  " + TA + "   |");
        double DA = (salary * 8) / 100;
        System.out.println("| DA  9%              :  " + DA + "   |");
        double PF = (salary * 20) / 100;
        System.out.println("| PF - 20&            :  " + PF + "   |");
        System.out.println("|                                 |");
        System.out.println("|---------------------------------|");
        double Grosssalary = salary + HRA + DA + TA - PF;
        System.out.println("|Gross Salary         : " + Grosssalary + "   |");
        System.out.println("|=================================|");


    }
}