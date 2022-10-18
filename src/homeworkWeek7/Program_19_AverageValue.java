package homeworkWeek7;
//19. Write a Java program to calculate the average value of array elements.

public class Program_19_AverageValue {

    public static void main(String[] args) {
        Average();
    }

    public static void Average() {

        double[] numArray = {20.3, 10.6, 54.1, 10.00, 25.6};
        double sum = 0.0;

        for (double num : numArray) {
            sum += num;
        }
        double average = sum / numArray.length;
        System.out.format("The average is: %.2f", average);
    }
}