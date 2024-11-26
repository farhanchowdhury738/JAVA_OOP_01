import java.lang.*;

//Package Bank
import Bank.*;

//Package Constructor

//Package Access Modifiers
import AccessModifiers.*;

//Package Polymorphism
import polymorphism.*;


public class Main
{
    public static void main  (String[] oop)
    {
        //Package Bank
        /*
        Bank bank1 = new Bank();
        bank1.name = "Farhan (Bank Package)";
        bank1.show();
        System.out.println();
*/

        //Package Constructors
        /*
       //Package Constructor
        Constructors c = new Constructors();
        c.name = "Chowdhury";
        c.age = 20;
        c.show();

        Constructors c1 = new Constructors("Jerin",13);
        c1.show();
        */

        // Access Modifiers
          /*
        AccessModifiers a = new AccessModifiers();
        a.name = "Hello";
        a.setEmail("farhan@gmail.com");
        a.setId(23523142);
        a.show();
*/

        //Polymorphism
        Shape s = new Shape();
        Rectangle r = new Rectangle(2.5,31);
        Triangle t  = new Triangle(2.7,52);

        System.out.println("Shape: "+s.area());
        System.out.println("Rectangle: "+r.area());
        System.out.println("Triangle: "+t.area());

    }
}