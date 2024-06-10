// to convert given numeric number system in binary system and code to print binary system in number system.

import java.util.*;

public class Java14 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numeric no. : ");
        int a = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        // conversion to binary system.

        while (a > 1) {
            sb.append(a % 2);
            a = a / 2;
        }
        sb.append('1');

        System.out.print("In binary system : ");
        for (int i = sb.length() - 1; i >= 0; i--)
            System.out.print(sb.charAt(i));
        System.out.println();

        // conversion to numeric system from binary system
        System.out.print("Enter the binary number : ");
        int s = sc.nextInt();
        int p = s;

        // length of no.
        int n = 0;
        for (int i = 1; s >= 1; i++) {
            s = s / 10;
            n++;
        }

        // conversion
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + pow(i - 1) * (p % 10);
            p = p / 10;
        }
        System.out.println("The numeric number is : " + sum);

    }

    public static int pow(int n) {
        int m = 1;
        if (n == 0)
            return 1;
        else
            for (int i = 0; i < n; i++) {
                m = m * 2;
            }
        return m;

    }

}
