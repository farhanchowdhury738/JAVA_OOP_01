import java.lang.*;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        StoryBook s1 =  new StoryBook();

        s1.setIsbn("12344");
        s1.setBookTitle("Hello java");
        s1.setAuthorName("Farhan");
        s1.setCategory("cse");
        s1.setAvailableQuantity(5);
        s1.setPrice(422);
        s1.display();
        System.out.println();

        TextBook t1 = new TextBook("1342","Hello","Farhan",34.3,4,45);
        t1.showDetails();

    }
}