package polymorphism;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Shape s = new Shape();
        Shape s1 = new Rectangle(45,5);
        Shape s2 = new Triangle(10,20);

        System.out.println(s.area());
        System.out.println(s1.area());
        System.out.println(s2.area());

        System.out.println("=============================");

        Shape shapeArray[] = new Shape[3];
        Scanner sc = new Scanner(System.in);

        shapeArray[0] = new Rectangle(45,5);
        shapeArray[1] = new Triangle(10,20);
        shapeArray[2] = new Triangle(10,20);


        for(int i=0; i<3; i++)
        {
            System.out.println(shapeArray[i].area());
        }




        /*
        Person p  = new Person();
        p.display();

        p = new Teacher();
        p.display();

        p = new Student();
        p.display();
    */

    }


}
