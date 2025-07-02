import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number : ");
        int a = scanner.nextInt();

        // Count the number of odd numbers to print
        int count = (a % 2==0) ? a-1 : a;

        System.out.print("Output: ");
        for (int j = 0; j < count; j++) {
            System.out.print(2 * j + 1);

            if (j < count - 1) {
                System.out.print(", ");
            }
        }
    }
}
