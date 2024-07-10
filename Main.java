import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        // prompts the user to enter an integer value
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer value: ");

        // Store this value in an integer variable
        int int1 = input.nextInt();


        // After calling the increment method,
        increment(int1);

        // display the original value to show that it has not been changed.
        System.out.println("Original integer value is " + int1 + " and has not been changed.");

    }

    // Implement a method named increment that takes an integer parameter.
    // This method should not return any values.
    public static void increment(int int1){
        // Inside this method, increment the value of the parameter by 1.
        // Note that this method should only modify the copy of the parameter
        // and not the original variable passed by the user.
        int1++;

        // Also, display the incremented value as it was modified within the method.
        System.out.println("Incremented value as it was modified within the method: " + int1);
    }

}
