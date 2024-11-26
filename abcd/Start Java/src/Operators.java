import java.lang.*;

public class Operators
{
    public static void main (String[] args)
    {
        //Operators

        int a = 39;
        int b = 34;
        int sum = a+b;
        int sub = a-b;
        int mul = a*b;

        double c = 121 , d=41;
        double div = c/d;
        double mod = c%d;

        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
        System.out.println(mod);

        int num = 12, num2 = 31;
        System.out.println(num); //12

        num++;
        ++num2;
        System.out.println(num); //13
        System.out.println(num2);  //32

        int num3 = 12, num4 = 31;
        System.out.println(num3); //12

        num3--;
        --num4;
        System.out.println(num3); //13
        System.out.println(num4);  //32



    }
}