// To find largest and smallest element in an array and both ascending and descending sorting.

import java.util.*;

public class Java9 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array :");
        int l = sc.nextInt();
        int array[] = new int[l];
        System.out.println("Enter the elements of array :");
        for (int i = 0; i < l; i++) {
            array[i] = sc.nextInt();
        }
        // ascending order
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i] < array[j])
                    continue;
                else {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println("Largest number :" + array[l - 1]);
        System.out.println("Smallest number :" + array[0]);
        System.out.println("Ascending order");
        for (int i = 0; i < l; i++) {
            System.out.print(array[i] + " ");
        }
        // descending order
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                if (array[i] > array[j])
                    continue;
                else {
                    int a = array[i];
                    array[i] = array[j];
                    array[j] = a;
                }
            }
        }
        System.out.println();
        System.out.println("Descending order");
        for (int i = 0; i < l; i++) {
            System.out.print(array[i] + " ");
        }
    }
}