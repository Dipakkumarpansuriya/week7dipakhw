package homeworkWeek7;

public class Program_11_Divided {
    public static void main(String args[]) {
        numbers();
    }
    public static void numbers() {
        System.out.println("\nDivided by 3: ");
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0)
                System.out.print(i + ", ");
        }
            System.out.println("\n\nDivided by 5: ");
            for (int x = 1; x < 100; x++) {
                if (x % 5 == 0) System.out.print(x + ", ");
            }
        }
    }


