package arrayList;

import java.util.*;

    // Array List Method
 /*
     add()
     for each loop
     Iterator
     remove()
     clear()
     isEmpty()
     contains()
     indexOf()
     set()
     get()
     equal()
     addAll()

 */

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<Integer> number = new ArrayList<Integer>();
        ArrayList<Integer> number2 = new ArrayList<Integer>();
        ArrayList<Integer> number3 = new ArrayList<Integer>();
        ArrayList<Integer> number4= new ArrayList<Integer>();

        //System.out.println("Size: "+number.size());

        // Array elements number
        number.add(24);
        number.add(42);
        number.add(34);
        number.add(3,30);
        ;

        // Array elements number3
        number2.add(94);
        number2.add(55);
        number2.add(79);
        number2.add(3,13);


        // Array elements number3
        number3.add(52);
        number3.add(23);
        number3.add(65);
        number3.add(3,67);

        System.out.println();
        System.out.print("Array number: "+number);
        System.out.print("\nArray number 2: "+number2);
        System.out.print("\nArray number 3: "+number3);
        System.out.println("\n===========================");

        //for each loop
        /*
        System.out.println(number);
        System.out.println("Size: "+number.size());

        for(int x : number)
        {
            System.out.print(x+ " ");
        }
        */

        //Iterator
        /*
        Iterator itr = number.iterator();
        while (itr.hasNext())
        {
            System.out.print(itr.next()+ " ");
        }
        System.out.println();
        */

        // remove elements
        /*
        System.out.println("After removing element: index 2");
        number.remove(2);
        System.out.println(number);

        System.out.println("after clear method: ");
        number.clear();
        System.out.println(number);
        */

        //check empty or not

        boolean b = number.isEmpty();
        boolean b2 = number4.isEmpty();
        System.out.println("\nArray of number: "+b);
        System.out.println("Array of number4: "+b2);
        System.out.println();

        //find elemnets
        boolean find = number.contains(24);
        System.out.println("24 is in the list: "+find);
        System.out.println();

        //find index
        int find2 = number.indexOf(34);
        System.out.println("34 indext num: "+find2);
        System.out.println();

        //Set method
        number.set(3,32);
        System.out.println("after setter method array number: "+number);

        //Get method
        int x = number.get(3);
        System.out.println("after getter mother index of 4: "+x);
        System.out.println();

        // equal method
        boolean b3 = number.equals(number4);
        System.out.print("number == number 4: "+b3);

        // addAll method
        number4.addAll(number);
        System.out.print("\nnumber 4: "+number4);








    }
}
