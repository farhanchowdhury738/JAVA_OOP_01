package array_2D;

import com.sun.security.jgss.GSSUtil;

public class Matrix_Sum {

    public static void main(String[] args) {

        int arr [][] = new int [][] { {2,3,4,5}, {6,7,8,9} };
        int arr2 [][] = new int [][] { {4,5,21,5}, {5,33,42,7} };

        System.out.println("Array of 1: ");
        for (int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Array of 2: ");
        for (int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }

        // Sum
        System.out.println("\nArray 1+2: ");
        int sum[][] = new int [2][3];
        for(int i=0; i<2; i++)
        {
            for(int j=0; j<3; j++)
            {
                sum[i][j] = arr[i][j]+arr2[i][j];
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }

    }
}
