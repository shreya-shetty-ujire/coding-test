import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int a = scanner.nextInt();

        // Edge case
        if (a < 0) {
            System.out.println("Please enter a non-negative integer");
            return;
        }

        // Generate and print odd numbers
        System.out.print("Output: ");
        for (int j = 0; j < a; j++) {
            int oddNumber = 2 * j + 1;
            System.out.print(oddNumber);

            if (j < a - 1) {
                System.out.print(", ");
            }
        }

    }
}
