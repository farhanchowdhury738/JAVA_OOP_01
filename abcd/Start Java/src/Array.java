import java.lang.*;
import java.util.Arrays;

public class Array{
    public static void main(String[] args)
    {
        System.out.println("Hello Array!");

        int che = 10;
        int phy = 20;
        int eng = 30;

        int[] mark = new int[5];
        mark[0] = 98;
        mark[1] = 94;
        mark[2] = 77;
        //System.out.println(mark[2]);
        //System.out.println(mark[4]);

        //length of array
        //System.out.println(mark.length);

        int[] marks = {1,4,5};
        System.out.println(marks);

        int [][] finalmarks = {{4,5,2}, {5,1,6}  };
        System.out.println(finalmarks[1][0]);
        System.out.println(finalmarks[0][0]);



    }
}