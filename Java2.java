import java.util.*;

public class Java2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        System.out.println("hence the sum of odd number lying in range is " + sum(i));
    }

    public static int sum(int n) {
        int s = 0;
        for (int i = 1; i <= n; i++) {
            s += i;
            i++;
        }
        return s;
    }
}