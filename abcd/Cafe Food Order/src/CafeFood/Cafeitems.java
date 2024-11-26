package CafeFood;

import java.util.*;

public class Cafeitems {
    int frenchFries = 100;
    int burger = 120;
    int pastry = 100;
    int pizza = 200;
    int coldCoffee = 100;
    int coldrink = 80;
    int icedtea = 80;

    int choice;
    int total;
    int quantity;
    String buyAgain;

    Scanner sc = new Scanner(System.in);

    public void bill()
    {
        System.out.println();
        System.out.println("--------Your Total Bill is: " +total+"-----------");
    }

    public void displayMenu()
    {
        System.out.println();
        System.out.println("------------------- Welcome To my first Cafe ---------------");
        System.out.println("=====================================================");
        System.out.println("           1.French Fries          100/-");
        System.out.println("           2.Burger                120/-");
        System.out.println("           3.Pastry                100/-");
        System.out.println("           4.Cold Drinks           80/- ");
        System.out.println("           5.Cold Coffee           100/-");
        System.out.println("           6.Pizza                 200/-");
        System.out.println("           7.Iced Tea              80/- ");
        System.out.println("           8.Exit                       ");
        System.out.println("======================================================");
        System.out.println("          What Do you Want to Order Today??");
    }//Food Menu is ready
    
    public void order ()
    {
        while (true)
        {
            System.out.print("Enter Your Choice ");
            choice = sc.nextInt();

            switch (choice)
            {
                case 1://French Fries
                {
                    System.out.println("Selected French Fries");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*frenchFries;
                    break;
                }

                case 2://burger
                {
                    System.out.println("Selected Burger");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*burger;
                    break;
                }

                case 3: //Pastry
                {
                    System.out.println("Selected Pastry");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*pastry;
                    break;
                }

                case 4: //Cold Drinks
                {
                    System.out.println("Selected Cold Drinks");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*coldrink;
                    break;
                }

                case 5://Cold Coffee
                {
                    System.out.println("Selected Cold Coffee");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total += quantity*coldCoffee ;
                    break;
                }

                case 6://Pizza
                {
                    System.out.println("Selected Pizza");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*pizza;
                    break;
                }

                case 7://Iced Tea
                {
                    System.out.println("Selected Iced Tea");
                    System.out.println();
                    System.out.println("Enter the quantity: ");
                    quantity = sc.nextInt();
                    total+= quantity*icedtea;
                    break;
                }

                case 8: //exit
                {
                    System.exit(1);;
                    break;
                }

                default:
                {
                    System.out.println("Invaild Number");
                    break;
                }
                // ----------------------------------Switch Case END------------------------


            }

            System.out.println();

            System.out.print("Do you want to order anything else (Y/N) : ");
            buyAgain = sc.next();

            if(equals("Y") || equals("y"))
            {
                displayMenu();
                order();
            }
            else
            {
                bill();
                System.exit(1);
            }

        }

    }
}
