import java.lang.*;
import java.util.Scanner;

public class Input
{
    public static void main (String[] args)
    {
        // number input
        Scanner sc = new Scanner(System.in);
        System.out.print("input your age: ");
        int age = sc.nextInt();
        System.out.println(age);

        if (age > 18)
        {
            System.out.println("vote done");
        }
        else
        {
            System.out.println("vote not done");
        }
        //String input
        Scanner na = new Scanner(System.in);
        String name;
        System.out.println("name: ");
        name = na.nextLine();
        System.out.println("Your Name: " + name);



    }
}