package array_2D;

import java.util.*;

public class Array_Sorting {

    public static void main(String[] args) {

        int arr[] = new  int[]{3,56,7};

        Arrays.sort(arr);

        System.out.println("Accending: ");
        for (int i=0; i<3; i++)
        {
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nDissending: ");
        for(int i=2; i>=0; i--)
        {
            System.out.print(arr[i]+ " ");
        }


    }
}
