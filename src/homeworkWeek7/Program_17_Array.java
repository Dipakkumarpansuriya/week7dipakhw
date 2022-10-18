package homeworkWeek7;
//17. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;

public class Program_17_Array {
    public static void main(String[] args) {
        array();
    }
    public static void array() {

        int[] my_array1 = {
                1300, 112, 200, 404, 6120, 1200, 2021};

        String[] my_array2 = {
                "England", "Chaina", "India", "Pakistan", "France", "America"};

        System.out.println("Original numeric array : " + Arrays.toString(my_array1));
        Arrays.sort(my_array1);
        System.out.println("Sorted numeric array : " + Arrays.toString(my_array1));

        System.out.println("Original string array : " + Arrays.toString(my_array2));
        Arrays.sort(my_array2);
        System.out.println("Sorted string array : " + Arrays.toString(my_array2));
    }
}
