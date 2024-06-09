// to print the hollow butterfly pattern

import java.util.*;

public class Java6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("* ");
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            while (i >= 1 && i < n) {
                System.out.print("* ");
                break;
            }
            for (int k = n - 1; k > i; k--) {
                System.out.print("  ");
                System.out.print("  ");
            }
            while (i < n) {
                System.out.print("* ");
                break;
            }
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            while (i >= 1 && i < n) {
                System.out.print("* ");
                break;
            }

            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i > 0; i--) {
            System.out.print("* ");
            for (int j = 2; j < i; j++) {
                System.out.print("  ");
            }
            while (i > 1) {
                System.out.print("* ");
                break;
            }
            for (int k = i; k < n; k++) {
                System.out.print("  ");
                System.out.print("  ");
            }
            while (i < n + 1) {
                System.out.print("* ");
                break;
            }
            for (int j = 2; j < i; j++) {
                System.out.print("  ");
            }
            while (i > 1 && i < n + 1) {
                System.out.print("* ");
                break;
            }

            System.out.println();
        }
    }

}
