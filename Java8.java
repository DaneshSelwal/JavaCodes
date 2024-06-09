// A fuction to check whether the given no is prime or not.

import java.util.*;

public class Java8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        if (i == 1)
            System.out.println("Not a prime number.");
        else
            prime(i);
    }

    public static void prime(int n) {
        for (int i = 2; i <= n; i++) {
            while (n % i == 0 && i != n) {
                System.out.println("Not a prime number");
                return;
            }
            while (n % i == 0 && i == n) {
                System.out.println("A prime number");
                return;
            }
        }
    }
}
