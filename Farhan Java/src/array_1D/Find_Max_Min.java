package array_1D;

import java.util.*;

public class Find_Max_Min {
    public static void main(String[] args) {

        int sum = 0;
        int arr1[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("arr " + (i + 1) + ": ");
            arr1[i] = sc.nextInt();
            sum += arr1[i];
        }
        System.out.print("Array is: ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
        System.out.println();

        int max = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i])
                max = arr1[i];
        }
        int min = arr1[0];
        for (int i = 0; i < arr1.length; i++) {
            if (min > arr1[i])
                min = arr1[i];
        }
        // Max &  Min
        System.out.println("Array Maximum: " + max);
        System.out.println("Array Minimum: " + min);
    }
}
