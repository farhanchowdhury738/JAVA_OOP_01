package array_2D;

public class Find_output
{

    /*
        19	18	17	16	15
        14	13	12	11	10
        9	8	7	6	5
        4	3	2	1	0

        0   1   2   3   4
        5   6   7   8   9
        10  11  12  13  14
        15  16  17  18  19

     */

    public static void main(String[] args) {


        int arr [][] = new int[4][5];
        int arr2 [][] = new int[4][5];

        int k=19, a=0;

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<5; j++)
            {
                arr[i][j] = k;
                k--;
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<5; j++)
            {
                arr2[i][j] = a;
                a++;
            }
        }
        for(int i=0; i<4; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(arr[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();

        for(int i=0; i<4; i++)
        {
            for(int j=0; j<5; j++)
            {
                System.out.print(arr2[i][j]+ "\t");
            }
            System.out.println();
        }



    }
}
