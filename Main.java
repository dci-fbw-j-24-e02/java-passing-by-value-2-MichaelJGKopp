import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int int1 = getUserInput();
        increment(int1);
        System.out.println("Original integer value is " + int1 + " and has not been changed.");
    }

    public static int getUserInput() {
        try (Scanner input = new Scanner(System.in)) {
            int int1 = 0;
            boolean validInput = false;

            while (!validInput) {
                System.out.println("Enter an integer value: ");
                try {
                    int1 = input.nextInt();
                    validInput = true;
                } catch (InputMismatchException e) {
                    // Handle invalid input
                    System.out.println("Invalid input. Please enter an integer value.");
                    input.next(); // Clear the invalid input
                }
            }
            return int1;
        }
    }

    public static void increment(int int1) {
        int1++;
        System.out.println("Incremented value as it was modified within the method: " + int1);
    }
}