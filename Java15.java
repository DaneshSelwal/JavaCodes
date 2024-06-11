//The three types of sorting :

import java.util.*;

public class Java15 {

    // function to print the sorted array.
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        // input the array
        System.out.println("Enter the array element :");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        // bubble ascending sorting
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int t = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = t;
                }
            }
        }

        System.out.println("Bubble sorted :");
        // passing array to fucntion.
        print(arr);

        // Selection sorting
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }

        // function calling
        System.out.println("Selection sorted :");
        print(arr);

        // Insertion sorting
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;
            while (j >= 0 && current > arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        // fuction calling
        System.out.println("Hence the Insertion sorted array is : ");
        print(arr);
    }

}
