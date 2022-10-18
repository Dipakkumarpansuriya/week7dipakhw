package homeworkWeek7;
//18. Write a Java program to sum values of an array.

public class Program_18_SumValueArray {
    public static void main(String[] args) {
        Sum();
    }

    public static void Sum() {
        double array[] = {20, 13.6, 45, -10.0, 10.5};
        double sum = 0.0;
        int i;
        for (i = 0; i < array.length; i++)
            sum += array[i];

        System.out.println("Sum of given array is " + sum);
    }
}
