//To get transpose of a input 2D matrix.

import java.util.*;

public class Java11 {
    public static void main(String argss[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of rows :");
        int a = sc.nextInt();

        System.out.println("Enter the no. of coloumns :");
        int b = sc.nextInt();

        int[][] matrix = new int[a][b];

        System.out.println("Enter the elements of matrix :");
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                matrix[i][j] = sc.nextInt();
        }

        System.out.println();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }

        System.out.println("The transpose of the following matrix :");
        for (int j = 0; j < a; j++) {
            for (int i = 0; i < b; i++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }

}
