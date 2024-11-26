package array_2D;

import java.util.*;
public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Type 1 number: ");
        int num1 = sc1.nextInt();
        System.out.print("Type 2 number: ");
        int num2 = sc2.nextInt();

        int arr [][] = new int [num1][num2];

        for(int i=0; i<num1; i++)
        {
            for(int j=0; j<num2; j++)
            {
                System.out.print("arr ["+i+"]"+"["+j+"]= ");
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("\n\nArray print: ");
        for(int i=0; i<num1; i++)
        {
            for(int j=0; j<num2; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }



    }
}

