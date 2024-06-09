//To print the Pascal Triangle

import java.util.*;

public class Java7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt(); // Number of rows for Pascal's Triangle

        for (int i = 0; i < rows; i++) {
            for (int k = rows; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(pascal(i, j) + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate the value at a specific position in Pascal's Triangle
    public static int pascal(int i, int j) {
        if (j == 0 || j == i) {
            return 1;
        }
        return pascal(i - 1, j - 1) + pascal(i - 1, j);
    }
}