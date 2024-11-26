package array_1D;

import java.util.*;

public class array1 {

    public static void main(String[] args) {


        // Array is a collection of variables  of the same data type.

        // Simple array create & output
        int [] number = new int[] {2,4,5,6,5,1,7,1};

        System.out.println("The First Array: ");
        for (int i=0; i<number.length; i++)
        {
            System.out.print(number[i]+" ");
        }
        System.out.println();

        //Array size print
        int len = number.length;
        System.out.println("Array size: "+len+"\n");

        // Array input & Sum
        int sum=0;
        int arr1[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for (int i=0; i<5; i++)
        {
            System.out.print("arr "+(i+1)+": ");
            arr1[i] = sc.nextInt();
            sum+=arr1[i];
        }
        System.out.print("Array is: ");
        for (int i=0; i<arr1.length; i++)
        {
            System.out.print(arr1[i]+" ");
        }
        System.out.println("\nArray Sum: "+sum);
        System.out.println("Array average: "+sum/arr1.length+"\n");
    }
}
