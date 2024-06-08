import java.util.*;

public class Java1 {
    // Method to calculate the average of three integers
    public static float average(int a, int b, int c) {
        float s = a + b + c;
        return (s / 3);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter three integers
        System.out.println("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // Call the average method and print the result
        System.out.println("The average is: " + average(a, b, c));

        // Close the Scanner
        sc.close();
    }
}
