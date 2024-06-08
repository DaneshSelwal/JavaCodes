
//To find the largest among the two no. inputed by the user.
import java.util.*;

public class Java3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println("The largest no. is " + greater(i, j));
    }

    public static int greater(int n, int m) {
        if (n < m)
            return m;
        else
            return n;
    }
}
