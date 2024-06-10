// String builder and its fuctions.

import java.util.*;

public class Java13 {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // character at Index
        System.out.println(sb.charAt(0));

        // set char at index 0
        sb.setCharAt(0, 'S');
        System.out.println(sb);

        // insert function
        sb.insert(1, 't');
        System.out.println(sb);

        // delete
        sb.delete(1, 2);
        System.out.println(sb);

        // append
        sb.append(" ");
        sb.append("S");
        sb.append("t");
        sb.append("a");
        sb.append("r");
        sb.append("k");
        System.out.println(sb);

        // for length
        System.out.println(sb.length());

        // A code to print reverse string enter by user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string you want to reverse :");
        String m = sc.nextLine();
        for (int i = m.length() - 1; i >= 0; i--) {
            System.out.print(m.charAt(i));
        }
    }
}
