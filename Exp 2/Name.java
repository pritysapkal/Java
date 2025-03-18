import java.util.Scanner;
import java.util.Arrays;

public class Name {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[5]; //10 names

        // Input 10 names 
        System.out.println("Enter 5 names:");
        for (int i = 0; i < names.length; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        Arrays.sort(names);

        System.out.println("\nNames in alphabetical order:");
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
