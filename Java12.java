// All about strings

import java.util.*;

public class Java12 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // concatination
        System.out.println("Enter first name :");
        String firstName = sc.nextLine();
        System.out.println("Enter last name :");
        String lastName = sc.nextLine();
        String fullName = firstName + " " + lastName;
        System.out.println(fullName);

        // length
        System.out.println("Length of string :");
        System.out.println(fullName.length());
        System.out.println();

        // charAt
        for (int i = 0; i < fullName.length(); i++)
            System.out.println(fullName.charAt(i));

        // comparing to Strings

        if (firstName.compareTo(lastName) == 0) {
            System.out.println("Both strings are equal.");
        } else if (firstName.compareTo(lastName) < 0) {
            System.out.println("firstName is smaller than lastName.");
        } else
            System.out.println("firstName is larger than lastName.");

        // substring
        String Name = fullName.substring(5, fullName.length());
        System.out.println(Name);
    }
}
