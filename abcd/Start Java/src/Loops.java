import java.lang.*;
import java.util.Scanner;

public class Loops{
    public static void main (String[] args)
    {

     /*
        //For Loop
        // 1-10
        for (int i = 0; i<5; i++)
        {
            System.out.println(i+1);
        }
        System.out.println();
        // 10-1


        //While Loop
        int i=0;
        while (i<5)
        {
            System.out.println(i+1);
            i++;
        }
        System.out.println();
        //Do While Loop
        int j=0;
        do{
            System.out.println(j+1);
            j++;
        } while (j<6);
    */

        Scanner nn = new  Scanner(System.in);

        int number;
        do{
            System.out.print("Type your number: ");
            number = nn.nextInt();
            System.out.println( "Here is your num: " + number);
        } while (number>3);

        System.out.println("THE END");



    }
}