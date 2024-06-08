// two no. are input by user and one no. is raised to power equal to other no.

import java.util.*;
public class Java4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first no.");
        int a = sc.nextInt();
        System.out.println("Enter the second no.");
        int b = sc.nextInt();
        System.out.println("The answer is " + power(a, b));
    }

    public static int power(int a, int b) {
        int x = 1;
        for (int i = 1; i <= b; i++) {
            x = x * a;
        }
        return x;
    }
}