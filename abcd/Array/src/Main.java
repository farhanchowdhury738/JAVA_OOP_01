import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello");

        Scanner sc = new Scanner(System.in);
        int arr[] =  new int [5];
        int sum=0,avg;

        for(int i=0; i<5; i++)
        {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        for(int i=0; i<5; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        System.out.print("even: ");
        for(int i=0; i<5; i++)
        {
            if(i%2==0)
            {
                System.out.print(arr[i]+" ");
            }
        }

        int large = arr[0];
        for (int i=0; i<5; i++)
        {
            if (large<arr[i])
            {
                large = arr[i];
            }
        }
        int small = arr[0];
        for (int i=0; i<5; i++)
        {
            if (small>arr[i])
            {
                small = arr[i];
            }
        }

        avg = sum/5;
        System.out.println("\nsum: "+sum);
        System.out.println("avg: "+avg);
        System.out.println("max: "+large);
        System.out.println("small: "+small);















    }
}