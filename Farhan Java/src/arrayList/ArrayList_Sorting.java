package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_Sorting {
    public static void main(String[] args) {



        ArrayList<Integer> number = new ArrayList<>();
        number.add(24);
        number.add(53);
        number.add(56);
        number.add(0);
        number.add(7);
        number.add(30);

        System.out.print("ArrayList: "+number);

        Collections.sort(number);
        System.out.println("\nAfter ArrayList: "+number);





    }
}
