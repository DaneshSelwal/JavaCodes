// Input a 2D matrix and print is element in spiral order.

import java.util.*;

public class Java10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int matrix[][] = new int[n][m];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < m; c++) {
                matrix[r][c] = sc.nextInt();
            }
        }

        System.out.println("The Spiral Order Matrix is : ");
        int i = 0;
        int a = n - 1;
        int j = 0;
        int b = m - 1;

        // To print spiral order matrix
        while (i <= a && j <= b) {
            // 1
            for (int c = j; c <= b; c++) {
                System.out.print(matrix[i][c] + " ");
            }
            i++;

            // 2
            for (int r = i; r <= a; r++) {
                System.out.print(matrix[r][b] + " ");
            }
            b--;

            // 3
            for (int c = b; c >= j; c--) {
                System.out.print(matrix[a][c] + " ");
            }
            a--;

            // 4
            for (int r = a; r >= i; r--) {
                System.out.print(matrix[r][j] + " ");
            }
            j++;

            System.out.println();
        }
    }
}