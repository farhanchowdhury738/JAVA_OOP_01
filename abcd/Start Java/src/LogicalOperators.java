import java.lang.*;
import java.util.Scanner;

public class LogicalOperators
{
    public static void main(String[] args)
    {
        Scanner sa = new Scanner(System.in);

        System.out.println("type number: ");
        int num = sa.nextInt();
        if (num>20)
        {
            System.out.println("Buy e pencil.");
            System.out.println("aslo buy a food.");
        }
        else if (num>10)
        {
            System.out.println("Buy a pen");
        }
        else if (num>5)
        {
            System.out.println("eraser");
        }
        else
        {
            System.out.println("nothing to buy.");
            System.out.println("get more money.1");
        }

    // -----------------Switch Case----------------
        Scanner sw = new Scanner(System.in);
        System.out.print("type number: ");
        int number = sa.nextInt();

        switch(number)
        {
            case 1:
                System.out.println("Sat");
                break;
            case 2:
                System.out.println("Sun");
                break;
            case 3:
                System.out.println("Mon");
                break;
            case 4:
                System.out.println("Tue");
                break;
            case 5:
                System.out.println("Wed");
                break;
            default:
                System.out.println("Wed-Sat4");


        }


    }
}