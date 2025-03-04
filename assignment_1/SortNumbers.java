import java.util.Scanner;
import java.util.Arrays;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input: Reading 10 numbers from the user
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Sorting the array in ascending order
        Arrays.sort(numbers);

        // Output: Displaying the sorted numbers
        System.out.println("Sorted numbers in ascending order:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
